package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.EditarCoordenadasDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class GuardarCoordenadasRepository {

    private final EntityManager entityManager;
    private static final String GUARDAR_COORDENADAS="sirena.pks_it_sgmto.guardar_coordenadas";


    public GuardarCoordenadasRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EditarCoordenadasDTO guardarCoord(EditarCoordenadasDTO editarCoordenadasDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_COORDENADAS);

        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecCaptacion", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSecVertimiento", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSistemaCoorde", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niX", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niY", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viTipoCoorde", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viDescripcion", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viObservaciones", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta",editarCoordenadasDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("niLinea",editarCoordenadasDTO.getNiLinea());
        storedProcedureQuery.setParameter("viUsuario",editarCoordenadasDTO.getViUsuario());
        storedProcedureQuery.setParameter("niSecCaptacion",editarCoordenadasDTO.getNiSecCaptacion());
        storedProcedureQuery.setParameter("niSecVertimiento",editarCoordenadasDTO.getNiSecVertimiento());
        storedProcedureQuery.setParameter("niSistemaCoorde",editarCoordenadasDTO.getNiSistemaCoorde());
        storedProcedureQuery.setParameter("niX",editarCoordenadasDTO.getNiX());
        storedProcedureQuery.setParameter("niY",editarCoordenadasDTO.getNiY());
        storedProcedureQuery.setParameter("viTipoCoorde",editarCoordenadasDTO.getViTipoCoorde());
        storedProcedureQuery.setParameter("viDescripcion",editarCoordenadasDTO.getViDescripcion());
        storedProcedureQuery.setParameter("viObservaciones",editarCoordenadasDTO.getViObservaciones());
        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        editarCoordenadasDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return editarCoordenadasDTO;
    }
}
