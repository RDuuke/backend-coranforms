package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class BorrarRecConAnaSituacionDTO {


     private BigDecimal niSecEEta;
     private BigDecimal nioLinea;
    private BigDecimal niLinea;
    private String  viIdUsuario;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public BigDecimal getNioLinea() {
        return nioLinea;
    }

    public void setNioLinea(BigDecimal nioLinea) {
        this.nioLinea = nioLinea;
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
}
