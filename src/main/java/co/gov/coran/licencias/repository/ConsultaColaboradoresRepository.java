package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;
@Repository
public class ConsultaColaboradoresRepository {
    private  static EntityManager entityManager;
    private  static   String CONSULTA_ASIGNADOS="sirena.pks_it_gnral.consultar_otros_asignados";

    public ConsultaColaboradoresRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public  static List<Object> listaColabora(BigDecimal niSecEEta, String viIdUsuario){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_ASIGNADOS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);
        storedProcedureQuery.setParameter("viIdUsuario",viIdUsuario);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
