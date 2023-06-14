package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

public class SituacionConsultaDTO {
    private BigDecimal Linea;
    private BigDecimal expobl_linea;
    private String texto;
    private String imagenes;
    private String tipo;
    private BigDecimal sistema_coordenadas;
    private BigDecimal x;
    private BigDecimal y;
    private String titulo;
    private BigDecimal cota;
    private Date fecha_creacion;
    private String creado_por;
    private Date fecha_modificacion;
    private String modificado_por;


    public BigDecimal getLinea() {
        return Linea;
    }

    public void setLinea(BigDecimal linea) {
        Linea = linea;
    }

    public BigDecimal getExpobl_linea() {
        return expobl_linea;
    }

    public void setExpobl_linea(BigDecimal expobl_linea) {
        this.expobl_linea = expobl_linea;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getSistema_coordenadas() {
        return sistema_coordenadas;
    }

    public void setSistema_coordenadas(BigDecimal sistema_coordenadas) {
        this.sistema_coordenadas = sistema_coordenadas;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigDecimal getCota() {
        return cota;
    }

    public void setCota(BigDecimal cota) {
        this.cota = cota;
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

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getModificado_por() {
        return modificado_por;
    }

    public void setModificado_por(String modificado_por) {
        this.modificado_por = modificado_por;
    }
}
