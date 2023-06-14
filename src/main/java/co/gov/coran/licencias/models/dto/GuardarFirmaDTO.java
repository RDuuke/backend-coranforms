package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;

public class GuardarFirmaDTO {
    private BigDecimal niSecEETA;
    private String  viIdUsuario;
    private BigDecimal  niHoras;
    private BigDecimal niMins;
    private Blob bliFirma;
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

    public BigDecimal getNiHoras() {
        return niHoras;
    }

    public void setNiHoras(BigDecimal niHoras) {
        this.niHoras = niHoras;
    }

    public BigDecimal getNiMins() {
        return niMins;
    }

    public void setNiMins(BigDecimal niMins) {
        this.niMins = niMins;
    }

    public Blob getBliFirma() {
        return bliFirma;
    }

    public void setBliFirma(Blob bliFirma) {
        this.bliFirma = bliFirma;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
