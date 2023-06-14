package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class SituacionConsultaRepository {
    private  static EntityManager entityManager;
    private  static   String CONSULTA_SITUACION="sirena.pks_it_gnral.consultar_situa_encontrada";

    public SituacionConsultaRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    public static List<Object> situacionLista(BigDecimal niSecEEta, Integer niLineaObliga){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_SITUACION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLineaObliga",Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);
        storedProcedureQuery.setParameter("niLineaObliga",niLineaObliga);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();
    }
}
