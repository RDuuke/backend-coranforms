package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarTextoRecomendaDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarTextoRecomendaRepository {

    private final EntityManager entityManager;

    private static final String storeProcedureName = "sirena.pks_it_gnral.borrar_texto_recomenda";

    BorrarTextoRecomendaRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public String borrarTextoRecomenda(BorrarTextoRecomendaDTO borrarTextoRecomendaDTO){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarTextoRecomendaDTO.getNiSec());
        storedProcedureQuery.setParameter("niLinea", borrarTextoRecomendaDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarTextoRecomendaDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);

    }

}
