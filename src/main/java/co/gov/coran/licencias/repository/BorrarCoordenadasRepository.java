package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarCoordenadasDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarCoordenadasRepository {
    private final EntityManager entityManager;

    private static final String storeProcedureName ="sirena.pks_it_sgmto.borrar_coordenadas";

    BorrarCoordenadasRepository(EntityManager entityManager){this.entityManager = entityManager;}

    public String borrarCoordenada(BorrarCoordenadasDTO borrarCoordenadasDTO){

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLineaCoordenada", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarCoordenadasDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("viUsuario", borrarCoordenadasDTO.getViUsuario());
        storedProcedureQuery.setParameter("niLineaCoordenada", borrarCoordenadasDTO.getNiLineaCoordenada());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);
     }
}
