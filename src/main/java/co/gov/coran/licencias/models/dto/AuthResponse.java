package co.gov.coran.licencias.models.dto;

public class AuthResponse {
    private String voemail;
    private String accessToken;
    private String  voerror;
    private String  voidconexion;
    private String vonombrecompleto;

    public AuthResponse() { }

    public AuthResponse(String voemail, String accessToken, String voerror, String voidconexion,String vonombrecompleto)  {
        this.voemail = voemail;
        this.accessToken = accessToken;
        this.voerror = voerror;
        this.voidconexion=voidconexion;
        this.vonombrecompleto =vonombrecompleto ;

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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
