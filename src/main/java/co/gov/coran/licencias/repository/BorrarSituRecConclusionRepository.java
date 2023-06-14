package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.BorrarRecConAnaSituacionDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;


@Repository
public class BorrarSituRecConclusionRepository {
    private final EntityManager entityManager;
    private static  final String BORRAR_RECOMIENDA="sirena.pks_it_gnral.borrar_textos_recomenda";
    private static  final String BORRAR_CONCLUSION="sirena.pks_it_gnral.borrar_textos_conclusion";
    private static  final String BORRAR_ANALISIS="sirena.pks_it_gnral.borrar_analisis_info";
    private static  final String BORRAR_SITUACION="sirena.pks_it_gnral.borrar_situa_encontrada";

    public BorrarSituRecConclusionRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public  String borrarRecConAnaSit(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_RECOMIENDA);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarRecConAnaSituacionDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", borrarRecConAnaSituacionDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarRecConAnaSituacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();
        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");
        System.out.println(voError);
        entityManager.close();
        return String.valueOf(voError);

    }

    public  String borrarConclusion(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_CONCLUSION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarRecConAnaSituacionDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", borrarRecConAnaSituacionDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarRecConAnaSituacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();
        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");
        System.out.println(voError);

        entityManager.close();

        return String.valueOf(voError);

    }

    public  String borrarAnalisis(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_ANALISIS);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarRecConAnaSituacionDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", borrarRecConAnaSituacionDTO.getNioLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarRecConAnaSituacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();
        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");
        System.out.println(voError);

        entityManager.close();
        return String.valueOf(voError);

    }

    public  String borrarSitu(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(BORRAR_SITUACION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLinea", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", borrarRecConAnaSituacionDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("niLinea", borrarRecConAnaSituacionDTO.getNiLinea());
        storedProcedureQuery.setParameter("viIdUsuario", borrarRecConAnaSituacionDTO.getViIdUsuario());

        storedProcedureQuery.execute();
        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");
        System.out.println(voError);
        entityManager.close();

        return String.valueOf(voError);

    }

}

