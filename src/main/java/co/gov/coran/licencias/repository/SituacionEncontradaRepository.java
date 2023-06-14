package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.SituacionEncontradaDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;

@Repository
public class SituacionEncontradaRepository {
    private final EntityManager entityManager;
    private static final String GUARDAR_SITUACION="sirena.pks_it_gnral.guardar_situa_encontrada";

    public SituacionEncontradaRepository(EntityManager entityManager) {this.entityManager = entityManager;}

    public SituacionEncontradaDTO guardarSituacionE(SituacionEncontradaDTO situacionEncontradaDTO){
        String voerror = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(GUARDAR_SITUACION);
        storedProcedureQuery.registerStoredProcedureParameter("niSecEEta", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nioLinea", Integer.class, ParameterMode.INOUT);
        storedProcedureQuery.registerStoredProcedureParameter("viTipo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niLineaObliga", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viTitulo", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niSistemaCoordenadas", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niX", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niY", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("niCota", BigDecimal.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciTexto", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ciImagenes", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viIdUsuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("niSecEEta", situacionEncontradaDTO.getNiSecEEta());
        storedProcedureQuery.setParameter("nioLinea", situacionEncontradaDTO.getNioLinea());
        storedProcedureQuery.setParameter("viTipo", situacionEncontradaDTO.getViTipo());
        storedProcedureQuery.setParameter("niLineaObliga", situacionEncontradaDTO.getNiLineaObliga());
        storedProcedureQuery.setParameter("viTitulo", situacionEncontradaDTO.getViTitulo());
        storedProcedureQuery.setParameter("niSistemaCoordenadas", situacionEncontradaDTO.getNiSistemaCoordenadas());
        storedProcedureQuery.setParameter("niX", situacionEncontradaDTO.getNiX());
        storedProcedureQuery.setParameter("niY", situacionEncontradaDTO.getNiY());
        storedProcedureQuery.setParameter("niCota", situacionEncontradaDTO.getNiCota());
        storedProcedureQuery.setParameter("ciTexto", situacionEncontradaDTO.getCiTexto());
        storedProcedureQuery.setParameter("ciImagenes", situacionEncontradaDTO.getCiImagenes());
        storedProcedureQuery.setParameter("viIdUsuario", situacionEncontradaDTO.getViIdUsuario());

        storedProcedureQuery.execute();

        Object  voError =  storedProcedureQuery.getOutputParameterValue("voError");

        System.out.println(voError);

        situacionEncontradaDTO.setVoError(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));
        entityManager.close();

        return situacionEncontradaDTO;


    }

}
