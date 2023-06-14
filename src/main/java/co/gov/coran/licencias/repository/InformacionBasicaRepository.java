package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class InformacionBasicaRepository {


    //private static EntityManager entityManager;
    private static  EntityManager entityManager;



    private static String INFORMACION_BASICA = "sirena.pks_it_gnral.datos_gnrales";


    public InformacionBasicaRepository (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static List<Object> listaDatosBasicos(Double niSecEEta, String viIdUsuario) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(INFORMACION_BASICA);

        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", Double.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);
      //  storedProcedureQuery.registerStoredProcedureParameter("coResultados", Object.class, ParameterMode.REF_CURSOR);
        storedProcedureQuery.registerStoredProcedureParameter("coResultados", InformacionBasicaDTO.class, ParameterMode.REF_CURSOR);


        storedProcedureQuery.setParameter("niSecEEta", niSecEEta);
        storedProcedureQuery.setParameter("viIdUsuario", viIdUsuario);

        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();
    }


}