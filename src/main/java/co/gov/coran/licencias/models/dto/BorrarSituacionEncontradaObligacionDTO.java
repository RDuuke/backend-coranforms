package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class BorrarSituacionEncontradaObligacionDTO {
    private BigDecimal niSecEEta;

    private BigDecimal niLinea;

    private String  viIdUsuario;

    private String voError;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public BigDecimal getNiLinea() {
        return niLinea;
    }

    public void setNiLinea(BigDecimal niLinea) {
        this.niLinea = niLinea;
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
