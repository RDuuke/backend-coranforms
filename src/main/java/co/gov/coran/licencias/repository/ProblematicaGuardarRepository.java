package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.ArrayList;


@Repository
public class ProblematicaGuardarRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_PROBLEMATICA="sirena.pks_it_sgmto.guardar_afectacion_amb";
    public ProblematicaGuardarRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ProblematicaGuardarDTO guardarProblematica(ProblematicaGuardarDTO problematicaGuardarDTO) {
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_PROBLEMATICA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viTipo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niIntensidad", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niExtension", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niPersistencia", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niReversibilidad", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niRecuperabilidad", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niProbabilidadOcurrencia", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciJustificacionImportancia", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciJustificacionriesgo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciJustificacionGnral", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciJustificacionAgentes", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viAgentesPeligro", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);
        String typeAgent = String.join(",", problematicaGuardarDTO.getTipos_agente_peligro());
        storedProcedureQuery.setParameter("niSecEEta", problematicaGuardarDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", problematicaGuardarDTO.getNioLinea());
        storedProcedureQuery.setParameter("viTipo", problematicaGuardarDTO.getViTipo());
        storedProcedureQuery.setParameter("viUsuario", problematicaGuardarDTO.getViUsuario());
        storedProcedureQuery.setParameter("niIntensidad", problematicaGuardarDTO.getNiIntensidad());
        storedProcedureQuery.setParameter("niExtension", problematicaGuardarDTO.getNiExtension());
        storedProcedureQuery.setParameter("niPersistencia", problematicaGuardarDTO.getNiPersistencia());
        storedProcedureQuery.setParameter("niReversibilidad", problematicaGuardarDTO.getNiReversibilidad());
        storedProcedureQuery.setParameter("niRecuperabilidad", problematicaGuardarDTO.getNiRecuperabilidad());
        storedProcedureQuery.setParameter("niProbabilidadOcurrencia", problematicaGuardarDTO.getNiProbabilidadOcurrencia());
        storedProcedureQuery.setParameter("ciJustificacionImportancia", problematicaGuardarDTO.getJustificacion_importancia());
        storedProcedureQuery.setParameter("ciJustificacionriesgo", problematicaGuardarDTO.getJustificacion_riesgo());
        storedProcedureQuery.setParameter("ciJustificacionGnral", problematicaGuardarDTO.getJustificacion_gnral());
        storedProcedureQuery.setParameter("ciJustificacionAgentes", problematicaGuardarDTO.getJustificacion_agente());
        storedProcedureQuery.setParameter("viAgentesPeligro", typeAgent);

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");
        Object  nioLinea =  storedProcedureQuery.getOutputParameterValue("nioLinea");


        System.out.println(voError);


        problematicaGuardarDTO.setVoerror(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        problematicaGuardarDTO.setNioLinea((String) storedProcedureQuery.getOutputParameterValue("nioLinea"));
        entityManager.close();
        return problematicaGuardarDTO;


    }
}
