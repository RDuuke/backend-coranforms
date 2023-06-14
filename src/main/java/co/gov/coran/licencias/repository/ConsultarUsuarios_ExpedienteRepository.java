package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultarUsuarios_ExpedienteRepository {
    private final EntityManager entityManager;
    private static final String CONSULTA_USUARIOS_EXP="sirena.pks_it_gnral.consultar_usuarios_Expediente";


    public ConsultarUsuarios_ExpedienteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Object> listaUsuariosE(BigDecimal niSecExp){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_USUARIOS_EXP);
        storedProcedureQuery.registerStoredProcedureParameter("niSecExp",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecExp",niSecExp);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
