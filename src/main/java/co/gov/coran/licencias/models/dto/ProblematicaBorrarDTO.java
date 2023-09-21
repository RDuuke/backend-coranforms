package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class ProblematicaBorrarDTO {

    private BigDecimal niSecEEta;
    private BigDecimal niLinea;
    private String viUsuario;
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

    public String getViUsuario() {
        return viUsuario;
    }

    public void setViUsuario(String viUsuario) {
        this.viUsuario = viUsuario;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
