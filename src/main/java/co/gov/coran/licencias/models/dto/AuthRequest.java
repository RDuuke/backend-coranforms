package co.gov.coran.licencias.models.dto;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class AuthRequest {

    @NotNull @Length(min = 5, max = 15)
    private String Password;
    @NotNull @Length(min = 5, max = 15)
    private String Usuario;
    @NotNull @Length(min = 5, max = 15)
    private String viip;
    @NotNull @Length(min = 5, max = 15)
    private String vinavegador;


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getViip() {
        return viip;
    }

    public void setViip(String viip) {
        this.viip = viip;
    }

    public String getVinavegador() {
        return vinavegador;
    }

    public void setVinavegador(String vinavegador) {
        this.vinavegador = vinavegador;
    }
}
