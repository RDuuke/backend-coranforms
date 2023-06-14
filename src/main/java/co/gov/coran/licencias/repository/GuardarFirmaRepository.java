package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarFirmanteDTO;
import co.gov.coran.licencias.models.dto.GuardarFirmaDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.sql.Blob;

@Repository
public class GuardarFirmaRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_FIRMA="sirena.pks_it_gnral.guardar_firma";
    private static  final String BORRAR_FIRMA="sirena.pks_it_gnral.borrar_firmante";

    GuardarFirmaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public GuardarFirmaDTO guardarFirma(GuardarFirmaDTO guardarFirmaDTO) {
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_FIRMA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niHoras", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niMins", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("bliFirma", Blob.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", guardarFirmaDTO.getNiSecEETA());
        storedProcedureQuery.setParameter("viIdUsuario", guardarFirmaDTO.getViIdUsuario());
        storedProcedureQuery.setParameter("niHoras", guardarFirmaDTO.getNiHoras());
        storedProcedureQuery.setParameter("niMins", guardarFirmaDTO.getNiMins());
        storedProcedureQuery.setParameter("bliFirma", guardarFirmaDTO.getBliFirma());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        guardarFirmaDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return guardarFirmaDTO;


    }

    public String borrarFirma(BorrarFirmanteDTO borrarFirmanteDTO) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_FIRMA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarFirmanteDTO.getNiSecEETA());
        storedProcedureQuery.setParameter("viIdUsuario", borrarFirmanteDTO.getViIdUsuario());


        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);


        entityManager.close();

        return String.valueOf(voError);

    }
}
