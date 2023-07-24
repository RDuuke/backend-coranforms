package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class BorrarAntecedenteGnralRepository {

    private final EntityManager entityManager;

    private static final String storeProcedureName = "sirena.pks_it_gnral.borrar_antecedente_gnral";

    BorrarAntecedenteGnralRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public String borrarAntecedenteGnral(BorrarAntecedenteDTO borrarAntecedenteDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(storeProcedureName);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarAntecedenteDTO.getNiSec());
        storedProcedureQuery.setParameter("nioLinea", borrarAntecedenteDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarAntecedenteDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);
    }

}