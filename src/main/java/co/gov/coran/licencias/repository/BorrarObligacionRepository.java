package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;
import co.gov.coran.licencias.models.dto.BorrarObligacionDTO;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarObligacionRepository {

    private final EntityManager entityManager;

    private static final String storeProcedureName = "sirena.pks_it_gnral.borrar_obligacion";

    BorrarObligacionRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public String borrarObligacion (BorrarObligacionDTO borrarObligacionDTO){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarObligacionDTO.getNiSec());
        storedProcedureQuery.setParameter("niLinea", borrarObligacionDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarObligacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);

    }

}
