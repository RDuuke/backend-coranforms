package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProblemaConsultaDTO {
        private BigDecimal eeta_sec;
        private String tipo;
        private String tipo_txt;
        private BigDecimal intensidad;
        private String intensidad_txt;
        private BigDecimal extension;
        private String extension_txt;
        private BigDecimal persistencia;
        private String persistencia_txt;
        private BigDecimal reversibilidad;
        private String reversibilidad_txt;
        private BigDecimal recuperabilidad;
        private String recuperabilidad_txt;
        private BigDecimal probabilidad_ocurrencia;
        private String probabilidad_ocurrencia_txt;
        private BigDecimal importancia_afectacion;
        private BigDecimal magnitud_potencial;
        private String magnitud_potencial_txt;
        private BigDecimal valor_riesgo;
       private String justificacion_importancia;
       private String justificacion_riesgo;
       private String justificacion_gnral;
        private Date Fecha_creacion;
        private String creado_por;


    public BigDecimal getEeta_sec() {
        return eeta_sec;
    }

    public void setEeta_sec(BigDecimal eeta_sec) {
        this.eeta_sec = eeta_sec;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_txt() {
        return tipo_txt;
    }

    public void setTipo_txt(String tipo_txt) {
        this.tipo_txt = tipo_txt;
    }

    public BigDecimal getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(BigDecimal intensidad) {
        this.intensidad = intensidad;
    }

    public String getIntensidad_txt() {
        return intensidad_txt;
    }

    public void setIntensidad_txt(String intensidad_txt) {
        this.intensidad_txt = intensidad_txt;
    }

    public BigDecimal getExtension() {
        return extension;
    }

    public void setExtension(BigDecimal extension) {
        this.extension = extension;
    }

    public String getExtension_txt() {
        return extension_txt;
    }

    public void setExtension_txt(String extension_txt) {
        this.extension_txt = extension_txt;
    }

    public BigDecimal getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(BigDecimal persistencia) {
        this.persistencia = persistencia;
    }

    public String getPersistencia_txt() {
        return persistencia_txt;
    }

    public void setPersistencia_txt(String persistencia_txt) {
        this.persistencia_txt = persistencia_txt;
    }

    public BigDecimal getReversibilidad() {
        return reversibilidad;
    }

    public void setReversibilidad(BigDecimal reversibilidad) {
        this.reversibilidad = reversibilidad;
    }

    public String getReversibilidad_txt() {
        return reversibilidad_txt;
    }

    public void setReversibilidad_txt(String reversibilidad_txt) {
        this.reversibilidad_txt = reversibilidad_txt;
    }

    public BigDecimal getRecuperabilidad() {
        return recuperabilidad;
    }

    public void setRecuperabilidad(BigDecimal recuperabilidad) {
        this.recuperabilidad = recuperabilidad;
    }

    public String getRecuperabilidad_txt() {
        return recuperabilidad_txt;
    }

    public void setRecuperabilidad_txt(String recuperabilidad_txt) {
        this.recuperabilidad_txt = recuperabilidad_txt;
    }

    public BigDecimal getProbabilidad_ocurrencia() {
        return probabilidad_ocurrencia;
    }

    public void setProbabilidad_ocurrencia(BigDecimal probabilidad_ocurrencia) {
        this.probabilidad_ocurrencia = probabilidad_ocurrencia;
    }

    public String getProbabilidad_ocurrencia_txt() {
        return probabilidad_ocurrencia_txt;
    }

    public void setProbabilidad_ocurrencia_txt(String probabilidad_ocurrencia_txt) {
        this.probabilidad_ocurrencia_txt = probabilidad_ocurrencia_txt;
    }

    public BigDecimal getImportancia_afectacion() {
        return importancia_afectacion;
    }

    public void setImportancia_afectacion(BigDecimal importancia_afectacion) {
        this.importancia_afectacion = importancia_afectacion;
    }

    public BigDecimal getMagnitud_potencial() {
        return magnitud_potencial;
    }

    public void setMagnitud_potencial(BigDecimal magnitud_potencial) {
        this.magnitud_potencial = magnitud_potencial;
    }

    public String getMagnitud_potencial_txt() {
        return magnitud_potencial_txt;
    }

    public void setMagnitud_potencial_txt(String magnitud_potencial_txt) {
        this.magnitud_potencial_txt = magnitud_potencial_txt;
    }

    public BigDecimal getValor_riesgo() {
        return valor_riesgo;
    }

    public void setValor_riesgo(BigDecimal valor_riesgo) {
        this.valor_riesgo = valor_riesgo;
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

    public Date getFecha_creacion() {
        return Fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        Fecha_creacion = fecha_creacion;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }
}
