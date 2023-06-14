package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ObligacionesItDTO {
    private BigDecimal exp_sec;
    private BigDecimal   Linea;
    private String ter_documento;
    private String   ter_Nombres;
    private BigDecimal doc_sec;
    private Date doc_fecha;
    private String doc_radicado;
    private String     obligacion;
    private BigDecimal plazo_meses;
    private String periodica;
    private String    Cumplio;
    private String observaciones;
    private String motivo_parcial;
    private Date     fecha_creacion;
    private String  creado_por;

    public BigDecimal getExp_sec() {
        return exp_sec;
    }

    public void setExp_sec(BigDecimal exp_sec) {
        this.exp_sec = exp_sec;
    }

    public BigDecimal getLinea() {
        return Linea;
    }

    public void setLinea(BigDecimal linea) {
        Linea = linea;
    }

    public String getTer_documento() {
        return ter_documento;
    }

    public void setTer_documento(String ter_documento) {
        this.ter_documento = ter_documento;
    }

    public String getTer_Nombres() {
        return ter_Nombres;
    }

    public void setTer_Nombres(String ter_Nombres) {
        this.ter_Nombres = ter_Nombres;
    }

    public BigDecimal getDoc_sec() {
        return doc_sec;
    }

    public void setDoc_sec(BigDecimal doc_sec) {
        this.doc_sec = doc_sec;
    }

    public Date getDoc_fecha() {
        return doc_fecha;
    }

    public void setDoc_fecha(Date doc_fecha) {
        this.doc_fecha = doc_fecha;
    }

    public String getDoc_radicado() {
        return doc_radicado;
    }

    public void setDoc_radicado(String doc_radicado) {
        this.doc_radicado = doc_radicado;
    }

    public String getObligacion() {
        return obligacion;
    }

    public void setObligacion(String obligacion) {
        this.obligacion = obligacion;
    }

    public BigDecimal getPlazo_meses() {
        return plazo_meses;
    }

    public void setPlazo_meses(BigDecimal plazo_meses) {
        this.plazo_meses = plazo_meses;
    }

    public String getPeriodica() {
        return periodica;
    }

    public void setPeriodica(String periodica) {
        this.periodica = periodica;
    }

    public String getCumplio() {
        return Cumplio;
    }

    public void setCumplio(String cumplio) {
        Cumplio = cumplio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMotivo_parcial() {
        return motivo_parcial;
    }

    public void setMotivo_parcial(String motivo_parcial) {
        this.motivo_parcial = motivo_parcial;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }
}
