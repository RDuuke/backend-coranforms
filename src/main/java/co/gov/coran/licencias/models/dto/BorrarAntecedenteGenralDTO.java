package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class BorrarAntecedenteGenralDTO {

    private BigDecimal niSecEEta;
    private BigDecimal nioLinea;
    private String viIdUsuario;
    private String voError;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public BigDecimal getNioLinea(){
        return nioLinea;
    }

    public void setNioLinea(BigDecimal nioLinea){
        this.nioLinea = nioLinea;
    }

    public String getViIdUsuario() {
        return viIdUsuario;
    }

    public void setViIdUsuario(String viIdUsuario) {
        this.viIdUsuario = viIdUsuario;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
