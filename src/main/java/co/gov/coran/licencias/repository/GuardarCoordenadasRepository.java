package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GuardarCoordenadasRepository {

    private final EntityManager entityManager;
    private static final String GUARDAR_COORDENADAS="sirena.pks_it_sgmto.guardar_coordenadas";


    public GuardarCoordenadasRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<GuardarCoordenadasDTO> guardarCoord(List<GuardarCoordenadasDTO> guardarCoordenadasDTOList) {
        List<GuardarCoordenadasDTO> resultados = new ArrayList<>();

        for (GuardarCoordenadasDTO guardarCoordenadasDTO : guardarCoordenadasDTOList) {
            StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_COORDENADAS);
            // ... (Registro de parámetros igual que antes)
            storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niLinea", BigDecimal.class, ParameterMode.INOUT);
            storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niSecCaptacion", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niSecVertimiento", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niSistemaCoorde", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niX", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("niY", BigDecimal.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("viTipoCoorde", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("viDescripcion", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("viObservaciones", String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter("niSecEEta", guardarCoordenadasDTO.getNiSecEEta());
            storedProcedureQuery.setParameter("niLinea", guardarCoordenadasDTO.getNiLinea());
            storedProcedureQuery.setParameter("viUsuario", guardarCoordenadasDTO.getViUsuario());
            storedProcedureQuery.setParameter("niSecCaptacion", guardarCoordenadasDTO.getNiSecCaptacion());
            storedProcedureQuery.setParameter("niSecVertimiento", guardarCoordenadasDTO.getNiSecVertimiento());
            storedProcedureQuery.setParameter("niSistemaCoorde", guardarCoordenadasDTO.getNiSistemaCoorde());
            storedProcedureQuery.setParameter("niX", guardarCoordenadasDTO.getNiX());
            storedProcedureQuery.setParameter("niY", guardarCoordenadasDTO.getNiY());
            storedProcedureQuery.setParameter("viTipoCoorde", guardarCoordenadasDTO.getViTipoCoorde());
            storedProcedureQuery.setParameter("viDescripcion", guardarCoordenadasDTO.getViDescripcion());
            storedProcedureQuery.setParameter("viObservaciones", guardarCoordenadasDTO.getViObservaciones());

            storedProcedureQuery.execute();

            Object voError = storedProcedureQuery.getOutputParameterValue("voError");
            System.out.println(voError);

            guardarCoordenadasDTO.setVoError(String.valueOf(voError));
            resultados.add(guardarCoordenadasDTO);
        }

        entityManager.close();

        return resultados;
    }
}
