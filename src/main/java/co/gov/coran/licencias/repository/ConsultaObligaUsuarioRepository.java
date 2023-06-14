package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultaObligaUsuarioRepository {
    private final EntityManager entityManager;
    private static final String CONSULTA_OBLIGACIONES="sirena.pks_it_sgmto.consultar_obliga_autoges";

    public ConsultaObligaUsuarioRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Object> listaObligaciones(BigDecimal niSecEETa){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_OBLIGACIONES);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETa",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETa",niSecEETa);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
