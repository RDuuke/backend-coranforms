package co.gov.coran.licencias.models.dto;

import oracle.sql.BLOB;

import java.math.BigDecimal;
import java.util.Date;

public class InformacionBasicaDTO {

    private String nombre_asunto;
    private String codigo_asunto;
    private String exp_sec;
    private String expediente;
    private String  numero_asignacion;
    private String fecha_asignacion;
    private  String nombre_interesado;
    private String documento_interesado;
    private String expedientes_relacionados;
    private String municipio;
    private String doc_sec_radicado;
    private String radicado;
    private Date doc_fecha;
    private String numero_visita;
    private  Date   fecha_realiza_visita;
    private BigDecimal  horas_duracion_visita;
    private String  trasporte_visita;
    private String acompagnantes_visita;
    private String es_autogestion;
    private String agregar_coordenadas_cs;

    public String getNombre_asunto() {
        return nombre_asunto;
    }

    public void setNombre_asunto(String nombre_asunto) {
        this.nombre_asunto = nombre_asunto;
    }

    public String getCodigo_asunto() {
        return codigo_asunto;
    }

    public void setCodigo_asunto(String codigo_asunto) {
        this.codigo_asunto = codigo_asunto;
    }

    public String getExp_sec() {
        return exp_sec;
    }

    public void setExp_sec(String exp_sec) {
        this.exp_sec = exp_sec;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getNumero_asignacion() {
        return numero_asignacion;
    }

    public void setNumero_asignacion(String numero_asignacion) {
        this.numero_asignacion = numero_asignacion;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getNombre_interesado() {
        return nombre_interesado;
    }

    public void setNombre_interesado(String nombre_interesado) {
        this.nombre_interesado = nombre_interesado;
    }

    public String getDocumento_interesado() {
        return documento_interesado;
    }

    public void setDocumento_interesado(String documento_interesado) {
        this.documento_interesado = documento_interesado;
    }

    public String getExpedientes_relacionados() {
        return expedientes_relacionados;
    }

    public void setExpedientes_relacionados(String expedientes_relacionados) {
        this.expedientes_relacionados = expedientes_relacionados;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDoc_sec_radicado() {
        return doc_sec_radicado;
    }

    public void setDoc_sec_radicado(String doc_sec_radicado) {
        this.doc_sec_radicado = doc_sec_radicado;
    }

    public String getRadicado() {
        return radicado;
    }

    public void setRadicado(String radicado) {
        this.radicado = radicado;
    }

    public Date getDoc_fecha() {
        return doc_fecha;
    }

    public void setDoc_fecha(Date doc_fecha) {
        this.doc_fecha = doc_fecha;
    }


    public String getNumero_visita() {
        return numero_visita;
    }

    public void setNumero_visita(String numero_visita) {
        this.numero_visita = numero_visita;
    }

    public Date getFecha_realiza_visita() {
        return fecha_realiza_visita;
    }

    public void setFecha_realiza_visita(Date fecha_realiza_visita) {
        this.fecha_realiza_visita = fecha_realiza_visita;
    }

    public String getTrasporte_visita() {
        return trasporte_visita;
    }

    public void setTrasporte_visita(String trasporte_visita) {
        this.trasporte_visita = trasporte_visita;
    }

    public String getAcompagnantes_visita() {
        return acompagnantes_visita;
    }

    public void setAcompagnantes_visita(String acompagnantes_visita) {
        this.acompagnantes_visita = acompagnantes_visita;
    }

    public BigDecimal getHoras_duracion_visita() {
        return horas_duracion_visita;
    }

    public void setHoras_duracion_visita(BigDecimal horas_duracion_visita) {
        this.horas_duracion_visita = horas_duracion_visita;
    }

    public String getEs_autogestion() {
        return es_autogestion;
    }

    public void setEs_autogestion(String es_autogestion) {
        this.es_autogestion = es_autogestion;
    }

    public String getAgregar_coordenadas_cs() {
        return agregar_coordenadas_cs;
    }

    public void setAgregar_coordenadas_cs(String agregar_coordenadas_cs) {
        this.agregar_coordenadas_cs = agregar_coordenadas_cs;
    }
}
