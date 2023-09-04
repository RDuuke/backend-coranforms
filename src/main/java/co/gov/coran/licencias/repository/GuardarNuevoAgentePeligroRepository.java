package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarNuevoAgentePeligroDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.ParameterMode;
import java.math.BigDecimal;

@Repository
public class GuardarNuevoAgentePeligroRepository {

    private final EntityManager entityManager;
    private static final String storeProcedure="sirena.pks_it_sgmto.guardar_nuevo_agente_peligro";

    public GuardarNuevoAgentePeligroRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public GuardarNuevoAgentePeligroDTO guardarNuevoAgentePeligro(GuardarNuevoAgentePeligroDTO nuevoAgentePeligro){

        System.out.println(nuevoAgentePeligro.getViCategoria());
        System.out.println(nuevoAgentePeligro.getViUsuario());
        System.out.println(nuevoAgentePeligro.getViNombre());
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedure);
        storedProcedureQuery.registerStoredProcedureParameter("viNombre", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viCategoria", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voCodigo", String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("viNombre", nuevoAgentePeligro.getViNombre());
        storedProcedureQuery.setParameter("viCategoria", nuevoAgentePeligro.getViCategoria());
        storedProcedureQuery.setParameter("viUsuario", nuevoAgentePeligro.getViUsuario());

        storedProcedureQuery.execute();

        Object  viCodigo =  storedProcedureQuery.getOutputParameterValue("voCodigo");
        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        nuevoAgentePeligro.setViCodigo(String.valueOf(storedProcedureQuery.getOutputParameterValue("voCodigo")));
        nuevoAgentePeligro.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));

        entityManager.close();

        return nuevoAgentePeligro;


    }

}
