package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultaAfectacionAmbientalRepository {

    private  static EntityManager entityManager;
    private  static   String storeProcedure ="sirena.pks_it_sgmto.consultar_afecta_agentes_peli";

    public ConsultaAfectacionAmbientalRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Object> listaAfectacionesAmbientales(BigDecimal niSecEEta, BigDecimal niLinea){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedure);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);
        storedProcedureQuery.setParameter("niLinea",niLinea);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

}
