package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.AsignaDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
@Repository
public class AsignacionesRepository {
    private final EntityManager entityManager;
    private static final String Asigna="sirena.pks_it_gnral.consultar_asignaciones";

    public AsignacionesRepository(EntityManager entityManager)
    {this.entityManager = entityManager;

    }

    public List<Object> listaAsigna(String viIdUsuario){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(Asigna);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("viIdUsuario",viIdUsuario);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();
    }


}
