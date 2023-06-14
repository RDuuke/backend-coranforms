package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.RecomendacionDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class TextoGuardarRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_TEXTO_RECOMENDACION="sirena.pks_it_gnral.guardar_texto_recomenda";
    private static final String GUARDAR_TEXTO_CONCLUSION="sirena.pks_it_gnral.guardar_texto_conclusion";

    public TextoGuardarRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public RecomendacionDTO guardarRecomendacion(RecomendacionDTO recomendacionDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_TEXTO_RECOMENDACION);
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

        recomendacionDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return recomendacionDTO;


    }

    public RecomendacionDTO guardarConclusion(RecomendacionDTO recomendacionDTO){
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

        recomendacionDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return recomendacionDTO;


    }
}
