package co.gov.coran.licencias.repository;
;
import co.gov.coran.licencias.models.dto.BorrarAntecedenteGenralDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarAntecedenteGnralRepository {

    private final EntityManager entityManager;

    private static final String storeProcedureName = "sirena.pks_it_gnral.borrar_antecedente_gnral";

    BorrarAntecedenteGnralRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public String borrarAntecedenteGnral(BorrarAntecedenteGenralDTO borrarAntecedenteGenralDTO){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", BigDecimal.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarAntecedenteGenralDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", borrarAntecedenteGenralDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarAntecedenteGenralDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);
    }

}
