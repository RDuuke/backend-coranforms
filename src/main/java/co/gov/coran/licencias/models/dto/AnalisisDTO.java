package co.gov.coran.licencias.models.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

public class AnalisisDTO implements Serializable {
   private BigDecimal Linea;
    private String texto;
    private Date fecha_creacion;
    private String creado_por;
    private Date fecha_modificación;
    private String modificado_por;

    public BigDecimal getLinea() {
        return Linea;
    }

    public void setLinea(BigDecimal linea) {
        Linea = linea;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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

    public Date getFecha_modificación() {
        return fecha_modificación;
    }

    public void setFecha_modificación(Date fecha_modificación) {
        this.fecha_modificación = fecha_modificación;
    }

    public String getModificado_por() {
        return modificado_por;
    }

    public void setModificado_por(String modificado_por) {
        this.modificado_por = modificado_por;
    }
}
