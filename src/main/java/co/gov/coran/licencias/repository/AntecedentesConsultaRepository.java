package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarAntecedenteRequestDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class AntecedentesConsultaRepository {
    private final EntityManager entityManager;
    private static final String CONSULTA_ANTECEDENTES="sirena.pks_it_gnral.consultar_antece_dispon";
    private static final String ANTECEDENTES_AGREGADOS="sirena.pks_it_gnral.consultar_antece_agregados";
    private static final String GUARDAR_ANTECEDENTES="sirena.pks_it_gnral.guardar_antecedente";
    private static final String BORRAR_ANTECEDENTES="sirena.pks_it_gnral.Borrar_antecedente";

    AntecedentesConsultaRepository(EntityManager entityManager)
    {this.entityManager = entityManager;

    }
    public List<Object> listaAntecedente(BigDecimal niSecEETA){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_ANTECEDENTES);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

    public List<Object> listaAgregadosAntecedente(BigDecimal niSecEETA){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(ANTECEDENTES_AGREGADOS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

    public List<Object> antecedenteExiste(BigDecimal niSecEETA){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(ANTECEDENTES_AGREGADOS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

    public String guardarAntecedentes(GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO) {
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_ANTECEDENTES);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", Double.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecDoc", Double.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", guardarAntecedenteRequestDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("niSecDoc", guardarAntecedenteRequestDTO.getNiSecDoc());
        storedProcedureQuery.setParameter("viIdUsuario", guardarAntecedenteRequestDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);


    }

    public String borrarAntecedentes(GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO) {
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_ANTECEDENTES);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", Double.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecDoc", Double.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", guardarAntecedenteRequestDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("niSecDoc", guardarAntecedenteRequestDTO.getNiSecDoc());
        storedProcedureQuery.setParameter("viIdUsuario", guardarAntecedenteRequestDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);


    }

}
