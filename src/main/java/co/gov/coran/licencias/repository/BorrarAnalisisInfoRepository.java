package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarAnalisisInfoDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarAnalisisInfoRepository {
    private final EntityManager entityManager;

    private static final String storeProcedureName = "sirena.pks_it_gnral.borrar_analisis_info";

    BorrarAnalisisInfoRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public String borrarAnalisisInfo(BorrarAnalisisInfoDTO borrarAnalisisInfoDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarAnalisisInfoDTO.getNiSec());
        storedProcedureQuery.setParameter("nioLinea", borrarAnalisisInfoDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarAnalisisInfoDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);
    }
}
