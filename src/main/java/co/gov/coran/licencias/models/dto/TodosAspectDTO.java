package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

public class TodosAspectDTO {

private BigDecimal linea;
private String texto;
private String imagenes;
private String titulo;
private String tipo;
private BigDecimal sistema_coordenadas;
private BigDecimal x;
private BigDecimal y;
private BigDecimal cota;
private Date fecha_creacion;
private String creado_por;
private Date fecha_modificado;
private String modificado_por;


    public BigDecimal getLinea() {
        return linea;
    }

    public void setLinea(BigDecimal linea) {
        this.linea = linea;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Date getFecha_modificado() {
        return fecha_modificado;
    }

    public void setFecha_modificado(Date fecha_modificado) {
        this.fecha_modificado = fecha_modificado;
    }

    public String getModificado_por() {
        return modificado_por;
    }

    public void setModificado_por(String modificado_por) {
        this.modificado_por = modificado_por;
    }
}
