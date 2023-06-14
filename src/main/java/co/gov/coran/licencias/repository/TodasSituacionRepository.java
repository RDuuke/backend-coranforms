package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class TodasSituacionRepository {
    private static EntityManager entityManager;
    private static  String SITUACION_TODAS="sirena.pks_it_gnral.consultar_situa_encont_todas";
    private static  String SITUACION_TODAS_ASP="sirena.pks_it_gnral.consultar_situa_encont_aspec";

    public TodasSituacionRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static List<Object> listaTodaSituacion(BigDecimal niSecEETA){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(SITUACION_TODAS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);


        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
       public static List<Object> listaTodoAspect(BigDecimal niSecEEta){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(SITUACION_TODAS_ASP);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);


        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }


}
