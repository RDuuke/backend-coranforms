package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarAnalisiDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class GuardarAnalisisRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_ANALISIS="sirena.pks_it_gnral.guardar_analisis_info";

    public GuardarAnalisisRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public GuardarAnalisiDTO guardarAnalisis(GuardarAnalisiDTO guardarAnalisiDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_ANALISIS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("ciTexto", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", guardarAnalisiDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", guardarAnalisiDTO.getNioLinea());
        storedProcedureQuery.setParameter("ciTexto", guardarAnalisiDTO.getCiTexto());
        storedProcedureQuery.setParameter("viIdUsuario", guardarAnalisiDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        guardarAnalisiDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return guardarAnalisiDTO;


    }
}
