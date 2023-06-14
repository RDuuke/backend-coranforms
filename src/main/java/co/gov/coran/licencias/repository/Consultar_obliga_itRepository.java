package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarObligacionItDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class Consultar_obliga_itRepository {
    private final EntityManager entityManager;
    private static final String CONSULTA_OBLIGACIONES_IT="sirena.pks_it_gnral.consultar_obliga_it";
    private static final String GUARDAR_OBLIGACIONES_IT="sirena.pks_it_gnral.guardar_obligacion_it";

    public Consultar_obliga_itRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Object> ObligacionesItListas(BigDecimal niSecEETA,String niSecTer){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_OBLIGACIONES_IT);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecTer",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);
        storedProcedureQuery.setParameter("niSecTer",niSecTer);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }


    public GuardarObligacionItDTO guardarObigaIt(GuardarObligacionItDTO guardarObligacionItDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_OBLIGACIONES_IT);

        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("niSecDoc", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecTer", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viObligacion",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viPeriodica", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niPlazo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viCumple", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viObs", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viMotivoParcial", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class,ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);


        storedProcedureQuery.setParameter("niSecEEta",guardarObligacionItDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea",guardarObligacionItDTO.getNioLinea());
        storedProcedureQuery.setParameter("niSecDoc",guardarObligacionItDTO.getNiSecDoc());
        storedProcedureQuery.setParameter("niSecTer",guardarObligacionItDTO.getNiSecTer());
        storedProcedureQuery.setParameter("viObligacion",guardarObligacionItDTO.getViObligacion());
        storedProcedureQuery.setParameter("viPeriodica",guardarObligacionItDTO.getViPeriodica());
        storedProcedureQuery.setParameter("niPlazo",guardarObligacionItDTO.getNiPlazo());
        storedProcedureQuery.setParameter("viCumple",guardarObligacionItDTO.getViCumple());
        storedProcedureQuery.setParameter("viObs",guardarObligacionItDTO.getViObs());
        storedProcedureQuery.setParameter("viMotivoParcial",guardarObligacionItDTO.getViMotivoParcial());
        storedProcedureQuery.setParameter("viIdUsuario",guardarObligacionItDTO.getViIdUsuario());
        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        guardarObligacionItDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return guardarObligacionItDTO;
    }
}
