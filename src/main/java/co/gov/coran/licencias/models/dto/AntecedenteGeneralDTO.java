package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class AntecedenteGeneralDTO {
    private BigDecimal niSecEEta;
    private String nioLinea;
    private String ciTexto;
    private String viIdUsuario;
    private String voError;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public String getNioLinea() {
        return nioLinea;
    }

    public void setNioLinea(String nioLinea) {
        this.nioLinea = nioLinea;
    }

    public String getCiTexto() {
        return ciTexto;
    }

    public void setCiTexto(String ciTexto) {
        this.ciTexto = ciTexto;
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
