package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class ProblematicaGuardarDTO {

   private BigDecimal niSecEEta;
   private String viUsuario;
    private String viTipo;
    private BigDecimal niIntensidad;
    private BigDecimal niExtension;
    private BigDecimal niPersistencia;
    private BigDecimal niReversibilidad;
    private BigDecimal niRecuperabilidad;
    private BigDecimal niProbabilidadOcurrencia;
    private String justificacion_importancia;
    private String justificacion_riesgo;
    private String justificacion_gnral;
    public String voerror;

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

    public String getViTipo() {
        return viTipo;
    }

    public void setViTipo(String viTipo) {
        this.viTipo = viTipo;
    }


    public BigDecimal getNiIntensidad() {
        return niIntensidad;
    }

    public void setNiIntensidad(BigDecimal niIntensidad) {
        this.niIntensidad = niIntensidad;
    }

    public BigDecimal getNiExtension() {
        return niExtension;
    }

    public void setNiExtension(BigDecimal niExtension) {
        this.niExtension = niExtension;
    }

    public BigDecimal getNiPersistencia() {
        return niPersistencia;
    }

    public void setNiPersistencia(BigDecimal niPersistencia) {
        this.niPersistencia = niPersistencia;
    }

    public BigDecimal getNiReversibilidad() {
        return niReversibilidad;
    }

    public void setNiReversibilidad(BigDecimal niReversibilidad) {
        this.niReversibilidad = niReversibilidad;
    }

    public BigDecimal getNiRecuperabilidad() {
        return niRecuperabilidad;
    }

    public void setNiRecuperabilidad(BigDecimal niRecuperabilidad) {
        this.niRecuperabilidad = niRecuperabilidad;
    }

    public BigDecimal getNiProbabilidadOcurrencia() {
        return niProbabilidadOcurrencia;
    }

    public void setNiProbabilidadOcurrencia(BigDecimal niProbabilidadOcurrencia) {
        this.niProbabilidadOcurrencia = niProbabilidadOcurrencia;
    }

    public String getJustificacion_importancia() {
        return justificacion_importancia;
    }

    public void setJustificacion_importancia(String justificacion_importancia) {
        this.justificacion_importancia = justificacion_importancia;
    }

    public String getJustificacion_riesgo() {
        return justificacion_riesgo;
    }

    public void setJustificacion_riesgo(String justificacion_riesgo) {
        this.justificacion_riesgo = justificacion_riesgo;
    }

    public String getJustificacion_gnral() {
        return justificacion_gnral;
    }

    public void setJustificacion_gnral(String justificacion_gnral) {
        this.justificacion_gnral = justificacion_gnral;
    }

    public String getVoerror() {
        return voerror;
    }

    public void setVoerror(String voerror) {
        this.voerror = voerror;
    }
}
