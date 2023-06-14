package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GeneralConsultaDTO {
    private BigDecimal linea;
    private String texto;
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
