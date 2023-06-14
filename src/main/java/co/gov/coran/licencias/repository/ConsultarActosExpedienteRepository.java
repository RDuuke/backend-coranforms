package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultarActosExpedienteRepository {
    private final EntityManager entityManager;
    private static final String CONSULTA_ACTOS_EXPEDIENTE="sirena.pks_it_gnral.consultar_actos_Expediente";

    public ConsultarActosExpedienteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Object> ListasActos(BigDecimal niSecExp ){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_ACTOS_EXPEDIENTE);
        storedProcedureQuery.registerStoredProcedureParameter("niSecExp",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecExp",niSecExp);


        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

}
