package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.validation.constraints.Email;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProblematicaConsultaRepository {

    private  static EntityManager entityManager;
    private  static   String CONSULTA_PROBLEMATICA="sirena.pks_it_sgmto.consultar_afectacion_amb";

    public ProblematicaConsultaRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public  static List<Object> problematicaList(BigDecimal niSecEEta){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_PROBLEMATICA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

       }

}
