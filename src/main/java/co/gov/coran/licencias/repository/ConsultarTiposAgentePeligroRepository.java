package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Repository
public class ConsultarTiposAgentePeligroRepository {

    private  static EntityManager entityManager;
    private  static String storeProcedureName="sirena.pks_it_sgmto.consultar_tipos_agente_peligro";

    public ConsultarTiposAgentePeligroRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Object> listaTiposAgentePeligro(String categoria){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("viCategoria", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("viCategoria",categoria);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }



}
