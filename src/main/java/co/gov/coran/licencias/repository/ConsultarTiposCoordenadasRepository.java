package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.ConsultarTiposCoordenadasDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;
@Repository
public class ConsultarTiposCoordenadasRepository {
    private  static EntityManager entityManager;
    private  static String storeProcedureName="sirena.pks_coordenadas.consultar_tipos_coordenadas";
    public ConsultarTiposCoordenadasRepository(EntityManager entityManager){this.entityManager = entityManager;}
    public List<ConsultarTiposCoordenadasDTO> tiposCoordenadas(BigDecimal niSecEEta, String viUsuario){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEEta",niSecEEta);
        storedProcedureQuery.setParameter("viUsuario",viUsuario);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }
}
