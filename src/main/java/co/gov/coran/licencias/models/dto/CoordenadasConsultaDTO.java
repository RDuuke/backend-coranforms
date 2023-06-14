package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CoordenadasConsultaDTO {
    private BigDecimal linea;
    private BigDecimal capta_sec;
    private BigDecimal vert_sec;
    private BigDecimal sistema_coordenadas;
    private String nombre_sistema_coordenadas;
    private BigDecimal x;
    private BigDecimal Y;
    private BigDecimal x_nacional;
    private BigDecimal y_nacional;
    private BigDecimal x_wgs84;
    private BigDecimal y_wgs84;
    private BigDecimal sec_municipio;
    private String nombre_municipio;
    private BigDecimal cota;
    private String cuenca_codigo;
    private String nombre_cuenca;
    private String nombre_fuente;
    private String descripcion;
    private String observaciones;
    private Date Fecha_creacion;
    private String creado_por;

    public BigDecimal getLinea() {
        return linea;
    }

    public void setLinea(BigDecimal linea) {
        this.linea = linea;
    }

    public BigDecimal getCapta_sec() {
        return capta_sec;
    }

    public void setCapta_sec(BigDecimal capta_sec) {
        this.capta_sec = capta_sec;
    }

    public BigDecimal getVert_sec() {
        return vert_sec;
    }

    public void setVert_sec(BigDecimal vert_sec) {
        this.vert_sec = vert_sec;
    }

    public BigDecimal getSistema_coordenadas() {
        return sistema_coordenadas;
    }

    public void setSistema_coordenadas(BigDecimal sistema_coordenadas) {
        this.sistema_coordenadas = sistema_coordenadas;
    }

    public String getNombre_sistema_coordenadas() {
        return nombre_sistema_coordenadas;
    }

    public void setNombre_sistema_coordenadas(String nombre_sistema_coordenadas) {
        this.nombre_sistema_coordenadas = nombre_sistema_coordenadas;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return Y;
    }

    public void setY(BigDecimal y) {
        Y = y;
    }

    public BigDecimal getX_nacional() {
        return x_nacional;
    }

    public void setX_nacional(BigDecimal x_nacional) {
        this.x_nacional = x_nacional;
    }

    public BigDecimal getY_nacional() {
        return y_nacional;
    }

    public void setY_nacional(BigDecimal y_nacional) {
        this.y_nacional = y_nacional;
    }

    public BigDecimal getX_wgs84() {
        return x_wgs84;
    }

    public void setX_wgs84(BigDecimal x_wgs84) {
        this.x_wgs84 = x_wgs84;
    }

    public BigDecimal getY_wgs84() {
        return y_wgs84;
    }

    public void setY_wgs84(BigDecimal y_wgs84) {
        this.y_wgs84 = y_wgs84;
    }

    public BigDecimal getSec_municipio() {
        return sec_municipio;
    }

    public void setSec_municipio(BigDecimal sec_municipio) {
        this.sec_municipio = sec_municipio;
    }

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public void setNombre_municipio(String nombre_municipio) {
        this.nombre_municipio = nombre_municipio;
    }

    public BigDecimal getCota() {
        return cota;
    }

    public void setCota(BigDecimal cota) {
        this.cota = cota;
    }

    public String getCuenca_codigo() {
        return cuenca_codigo;
    }

    public void setCuenca_codigo(String cuenca_codigo) {
        this.cuenca_codigo = cuenca_codigo;
    }

    public String getNombre_cuenca() {
        return nombre_cuenca;
    }

    public void setNombre_cuenca(String nombre_cuenca) {
        this.nombre_cuenca = nombre_cuenca;
    }

    public String getNombre_fuente() {
        return nombre_fuente;
    }

    public void setNombre_fuente(String nombre_fuente) {
        this.nombre_fuente = nombre_fuente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
