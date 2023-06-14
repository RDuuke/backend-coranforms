package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

public class TodaSituacionDTO {

    private BigDecimal linea;
    private BigDecimal expobl_exp_sec;
    private BigDecimal expobl_linea;
    private String texto;
    private String imagenes;
    private String tipo;
    private BigDecimal SISTEMA_COORDENADAS;
    private BigDecimal x;
    private BigDecimal y;
    private String  titulo;
    private BigDecimal cota;
    private Date FECHA_CREACION;
    private String CREADO_POR;


    public BigDecimal getLinea() {
        return linea;
    }

    public void setLinea(BigDecimal linea) {
        this.linea = linea;
    }

    public BigDecimal getExpobl_exp_sec() {
        return expobl_exp_sec;
    }

    public void setExpobl_exp_sec(BigDecimal expobl_exp_sec) {
        this.expobl_exp_sec = expobl_exp_sec;
    }

    public BigDecimal getExpobl_linea() {
        return expobl_linea;
    }

    public void setExpobl_linea(BigDecimal expobl_linea) {
        this.expobl_linea = expobl_linea;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getSISTEMA_COORDENADAS() {
        return SISTEMA_COORDENADAS;
    }

    public void setSISTEMA_COORDENADAS(BigDecimal SISTEMA_COORDENADAS) {
        this.SISTEMA_COORDENADAS = SISTEMA_COORDENADAS;
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

    public Date getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(Date FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getCREADO_POR() {
        return CREADO_POR;
    }

    public void setCREADO_POR(String CREADO_POR) {
        this.CREADO_POR = CREADO_POR;
    }
}
