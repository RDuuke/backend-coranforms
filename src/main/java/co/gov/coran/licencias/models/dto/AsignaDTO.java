package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AsignaDTO {
    public BigDecimal sec;
    public BigDecimal exp_sec;
    public String expediente;
    public String radicado;
    public String numero_asignacion;
    public String tipo_etapa;
    public String nom_tipo_actuacion;
    public String cod_tipo_actuacion;
    public String tipo_tramite;
    public Date fecha_asignacion;
    public String estrategia;
    public String observacion;
    public BigDecimal doc_sec;

    public BigDecimal getSec() {
        return sec;
    }

    public void setSec(BigDecimal sec) {
        this.sec = sec;
    }

    public BigDecimal getExp_sec() {
        return exp_sec;
    }

    public void setExp_sec(BigDecimal exp_sec) {
        this.exp_sec = exp_sec;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getRadicado() {
        return radicado;
    }

    public void setRadicado(String radicado) {
        this.radicado = radicado;
    }

    public String getNumero_asignacion() {
        return numero_asignacion;
    }

    public void setNumero_asignacion(String numero_asignacion) {
        this.numero_asignacion = numero_asignacion;
    }

    public String getTipo_etapa() {
        return tipo_etapa;
    }

    public void setTipo_etapa(String tipo_etapa) {
        this.tipo_etapa = tipo_etapa;
    }

    public String getNom_tipo_actuacion() {
        return nom_tipo_actuacion;
    }

    public void setNom_tipo_actuacion(String nom_tipo_actuacion) {
        this.nom_tipo_actuacion = nom_tipo_actuacion;
    }

    public String getCod_tipo_actuacion() {
        return cod_tipo_actuacion;
    }

    public void setCod_tipo_actuacion(String cod_tipo_actuacion) {
        this.cod_tipo_actuacion = cod_tipo_actuacion;
    }

    public String getTipo_tramite() {
        return tipo_tramite;
    }

    public void setTipo_tramite(String tipo_tramite) {
        this.tipo_tramite = tipo_tramite;
    }

    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getDoc_sec() {
        return doc_sec;
    }

    public void setDoc_sec(BigDecimal doc_sec) {
        this.doc_sec = doc_sec;
    }
}
