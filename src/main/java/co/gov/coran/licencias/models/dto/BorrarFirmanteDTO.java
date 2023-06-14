package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class BorrarFirmanteDTO {
    private BigDecimal niSecEETA;
    private String  viIdUsuario;
    private String voError;


    public BigDecimal getNiSecEETA() {
        return niSecEETA;
    }

    public void setNiSecEETA(BigDecimal niSecEETA) {
        this.niSecEETA = niSecEETA;
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
