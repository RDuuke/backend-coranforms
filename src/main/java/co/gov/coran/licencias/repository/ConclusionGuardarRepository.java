package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.RecomendacionDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.sql.Blob;

@Repository
public class ConclusionGuardarRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_TEXTO_CONCLUSION="sirena.pks_it_gnral.guardar_texto_conclusion";

    public ConclusionGuardarRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String guardarConclusion(RecomendacionDTO recomendacionDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_TEXTO_CONCLUSION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("ciTexto", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", recomendacionDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", recomendacionDTO.getNioLinea());
        storedProcedureQuery.setParameter("ciTexto", recomendacionDTO.getCiTexto());
        storedProcedureQuery.setParameter("viIdUsuario", recomendacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);


    }
}
