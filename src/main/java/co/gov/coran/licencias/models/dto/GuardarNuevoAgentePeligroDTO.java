package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class GuardarNuevoAgentePeligroDTO {

    private String viNombre;
    private String viCategoria;
    private String viUsuario;
    private String viCodigo;
    private String voError;

    public BigDecimal getViNombre() {
        return viNombre;
    }

    public void setViNombre(String viNombre) {
        this.viNombre = viNombre;
    }

    public String getViCategoria() {
        return viCategoria;
    }

    public void setViCategoria(String viCategoria) {
        this.viCategoria = viCategoria;
    }

    public String getViUsuario() {
        return viUsuario;
    }

    public void setViUsuario(String viUsuario) {
        this.viUsuario = viUsuario;
    }

    public String getViCodigo() {
        return viCodigo;
    }

    public void setViCodigo(String viCodigo) {
        this.viCodigo = viCodigo;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
