package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProblematicaConsultaByLineaRepository {

    private EntityManager entityManager;

    private static final String CONSULTA_PROBLEMATICA_ITEM = "sirena.pks_it_sgmto.consultar_afectacion_amb";

    public ProblematicaConsultaByLineaRepository(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    public List<Object> problematicaConsultaItem(BigDecimal niSecEEta, BigDecimal niLinea)
    {
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_PROBLEMATICA_ITEM);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);


        storedProcedureQuery.setParameter("niSecEEta", niSecEEta);
        storedProcedureQuery.setParameter("niLinea", niLinea);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
