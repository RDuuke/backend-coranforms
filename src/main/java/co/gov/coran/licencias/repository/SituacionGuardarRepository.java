package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.SituacionGuardarDTO;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class SituacionGuardarRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_SITUACION="sirena.pks_it_gnral.guardar_situa_encontrada";
    SituacionGuardarRepository(EntityManager entityManager) {this.entityManager = entityManager;}
    public SituacionGuardarDTO guardarSituacionE(SituacionGuardarDTO situacionGuardarDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_SITUACION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viTipo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLineaObliga", String.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viTitulo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSistemaCoordenadas", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niX", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niY", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niCota", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciTexto", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciImagenes", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", situacionGuardarDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", situacionGuardarDTO.getNioLinea());
        storedProcedureQuery.setParameter("viTipo", situacionGuardarDTO.getViTipo());
        storedProcedureQuery.setParameter("niLineaObliga", situacionGuardarDTO.getNiLineaObliga());
        storedProcedureQuery.setParameter("viTitulo", situacionGuardarDTO.getViTitulo());
        storedProcedureQuery.setParameter("niSistemaCoordenadas", situacionGuardarDTO.getNiSistemaCoordenadas());
        storedProcedureQuery.setParameter("niX", situacionGuardarDTO.getNiX());
        storedProcedureQuery.setParameter("niY", situacionGuardarDTO.getNiY());
        storedProcedureQuery.setParameter("niCota", situacionGuardarDTO.getNiCota());
        storedProcedureQuery.setParameter("ciTexto", situacionGuardarDTO.getCiTexto());
        storedProcedureQuery.setParameter("ciImagenes", situacionGuardarDTO.getCiImagenes());
        storedProcedureQuery.setParameter("viIdUsuario", situacionGuardarDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        situacionGuardarDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return situacionGuardarDTO;


    }

}
