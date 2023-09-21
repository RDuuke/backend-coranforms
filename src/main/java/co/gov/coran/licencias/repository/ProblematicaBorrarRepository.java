package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.ProblematicaBorrarDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class ProblematicaBorrarRepository {

    private final EntityManager entityManager;

    private static final String BORRAR_PROBLEMATICA = "sirena.pks_it_sgmto.borrar_afectacion_amb";
    ProblematicaBorrarRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public String borrarAfectacionAmb(ProblematicaBorrarDTO problematicaBorrarDTO){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_PROBLEMATICA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.INOUT);

        storedProcedureQuery.setParameter("niSecEEta", problematicaBorrarDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("niLinea", problematicaBorrarDTO.getNiLinea());
        storedProcedureQuery.setParameter("viUsuario", problematicaBorrarDTO.getViUsuario());

        storedProcedureQuery.execute();

        Object voError = storedProcedureQuery.getOutputParameterValue("voError");
        System.out.println(voError);
        return String.valueOf(voError);
    }

}
