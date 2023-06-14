package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultaRecomendacionRepository {
    private  static EntityManager entityManager;
    private  static   String CONSULTA_RECOMENDACION="sirena.pks_it_gnral.consultar_textos_recomenda";
    private static  String CONSULTA_CONCLUSION = "sirena.pks_it_gnral.consultar_textos_conclusion";

    public ConsultaRecomendacionRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    public  static List<Object> recomienda(BigDecimal niSecEEta){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_RECOMENDACION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

    public  static List<Object> conclusion(BigDecimal niSecEEta){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_CONCLUSION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
