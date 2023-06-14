package co.gov.coran.licencias.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class ConsultarCoordenadasRepository {
    private static EntityManager entityManager;
    private static  String CONSULTA_COORDENADAS="sirena.pks_it_sgmto.consultar_coordenadas";

    public ConsultarCoordenadasRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public static List<Object> listaCoordenadas(BigDecimal niSecEETA, String viUsuario){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(CONSULTA_COORDENADAS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEETA",BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario",String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError",String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados",Object.class, ParameterMode.REF_CURSOR);

        storedProcedureQuery.setParameter("niSecEETA",niSecEETA);
        storedProcedureQuery.setParameter("viUsuario", viUsuario);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();

    }

}
