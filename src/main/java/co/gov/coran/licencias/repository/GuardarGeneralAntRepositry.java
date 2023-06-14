package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.AntecedenteGeneralDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class GuardarGeneralAntRepositry {


    private static EntityManager entityManager;

    private static final String GUARDAR_GENERAL_ANT="sirena.pks_it_gnral.guardar_antecedente_gnral";
    private static final String CONSULTA_GENERAL_ANT="sirena.pks_it_gnral.consultar_antecedente_gnral";

    public GuardarGeneralAntRepositry(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public AntecedenteGeneralDTO guardarGeneralAn(AntecedenteGeneralDTO antecedenteGeneralDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_GENERAL_ANT);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("ciTexto", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", antecedenteGeneralDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", antecedenteGeneralDTO.getNioLinea());
        storedProcedureQuery.setParameter("ciTexto", antecedenteGeneralDTO.getCiTexto());
        storedProcedureQuery.setParameter("viIdUsuario", antecedenteGeneralDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        antecedenteGeneralDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return antecedenteGeneralDTO;


    }
    public static List<Object> listaGeneralAnte(BigDecimal niSecEEta){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_GENERAL_ANT);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();


    }


}
