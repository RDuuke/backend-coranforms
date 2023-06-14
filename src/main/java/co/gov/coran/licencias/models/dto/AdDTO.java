package co.gov.coran.licencias.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


public class AdDTO {
    public String Usuario;
    public String Password;
    public String vinavegador;
    public String viip;
    public String voidconexion;
    public String vonombrecompleto;
    public String voemail;
    public String voerror;
    public String token;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken(String token) {
        return this.token;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getVinavegador() {
        return vinavegador;
    }

    public void setVinavegador(String vinavegador) {
        this.vinavegador = vinavegador;
    }

    public String getViip() {
        return viip;
    }

    public void setViip(String viip) {
        this.viip = viip;
    }

    public String getVoidconexion() {
        return voidconexion;
    }

    public void setVoidconexion(String voidconexion) {
        this.voidconexion = voidconexion;
    }

    public String getVonombrecompleto() {
        return vonombrecompleto;
    }

    public void setVonombrecompleto(String vonombrecompleto) {
        this.vonombrecompleto = vonombrecompleto;
    }

    public String getVoemail() {
        return voemail;
    }

    public void setVoemail(String voemail) {
        this.voemail = voemail;
    }

    public String getVoerror() {
        return voerror;
    }

    public void setVoerror(String voerror) {
        this.voerror = voerror;
    }
}
