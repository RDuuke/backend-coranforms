package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;


public class BorrarCoordenadasDTO {

    private BigDecimal niSecEEta;

    private String viUsuario;

    private BigDecimal niLineaCoordenada;

    private String voError;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public String getViUsuario() {
        return viUsuario;
    }

    public void setViUsuario(String viUsuario) {
        this.viUsuario = viUsuario;
    }

    public BigDecimal getNiLineaCoordenada() {
        return niLineaCoordenada;
    }

    public void setNiLineaCoordenada(BigDecimal niLineaCoordenada) {
        this.niLineaCoordenada = niLineaCoordenada;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
