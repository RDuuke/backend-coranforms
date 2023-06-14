package co.gov.coran.licencias.repository;

import co.gov.coran.licencias.models.dto.AdDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

@Repository
public class DirectoryActiveRepository {
    private  final EntityManager entityManager;
    private static  final String AD ="sirena.prs_conectar_sirena";

    public DirectoryActiveRepository(EntityManager entityManager) {this.entityManager = entityManager;}

    public AdDTO conexionAd(AdDTO adDTO){
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery(AD);
        storedProcedureQuery.registerStoredProcedureParameter("viusuario", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viclave", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("vinavegador", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("viip", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("voidconexion", String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("vonombrecompleto", String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("voemail", String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("voError", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("viusuario", adDTO.getUsuario());
        storedProcedureQuery.setParameter("viclave", adDTO.getPassword());
        storedProcedureQuery.setParameter("vinavegador", adDTO.getVinavegador());
        storedProcedureQuery.setParameter("viip",adDTO.getViip());

        storedProcedureQuery.execute();

        adDTO.setVoidconexion(String.valueOf(storedProcedureQuery.getOutputParameterValue("voidconexion")));
        adDTO.setVonombrecompleto(String.valueOf(storedProcedureQuery.getOutputParameterValue("vonombrecompleto")));
        adDTO.setVoemail(String.valueOf(storedProcedureQuery.getOutputParameterValue("voemail")));
        adDTO.setVoerror(String.valueOf(storedProcedureQuery.getOutputParameterValue("voError")));

        entityManager.close();
        return adDTO ;
    }
}
