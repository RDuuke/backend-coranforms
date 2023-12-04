package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarTerminarInformeDTO;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
@Repository
public class GuardarTerminarInformeRepository {

    private final EntityManager entityManager;
    private static final String TERMINAR_INFORME = "sirena.pks_it_gnral.terminar_informe";
    public GuardarTerminarInformeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public GuardarTerminarInformeDTO guardarTerminarInforme(GuardarTerminarInformeDTO guardarTerminarInformeDTO){
        try {
            String voerror = null;
            StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(TERMINAR_INFORME);
            storedProcedureQuery.registerStoredProcedureParameter("niSecEEta" , BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter("niSecEEta", guardarTerminarInformeDTO.getNiSecEEta());
            storedProcedureQuery.setParameter("viIdUsuario", guardarTerminarInformeDTO.getViIdUsuario());

            storedProcedureQuery.execute();

            Object voError = storedProcedureQuery.getOutputParameterValue("voError");

            guardarTerminarInformeDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));

            return guardarTerminarInformeDTO;
        }catch (DataIntegrityViolationException e){
            e.printStackTrace();
            guardarTerminarInformeDTO.setVoError("Error en la base de datos: " + e.getMessage());
            return guardarTerminarInformeDTO;
        }

    }
}
