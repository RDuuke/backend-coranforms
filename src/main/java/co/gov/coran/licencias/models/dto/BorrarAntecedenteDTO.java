package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
public class BorrarAntecedenteDTO {
    private BigDecimal niSecEEta;
    private BigDecimal niSecDoc;
    private String  viIdUsuario;
    private String voError;
    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }
    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }
    public BigDecimal getNiSecDoc() {
        return niSecDoc;
    }
    public void setNiSecDoc(BigDecimal niSecDoc) {
        this.niSecDoc = niSecDoc;
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
