package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ActosExpedientesDTO {
   private BigDecimal sec;
    private String Radicado;
    private Date Fecha;
    private String descriptor;
    private String Link_descarga;
    private Date fecha_notificacion;
    private Date fecha_firmeza;

    public BigDecimal getSec() {
        return sec;
    }

    public void setSec(BigDecimal sec) {
        this.sec = sec;
    }

    public String getRadicado() {
        return Radicado;
    }

    public void setRadicado(String radicado) {
        Radicado = radicado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getLink_descarga() {
        return Link_descarga;
    }

    public void setLink_descarga(String link_descarga) {
        Link_descarga = link_descarga;
    }

    public Date getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(Date fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    public Date getFecha_firmeza() {
        return fecha_firmeza;
    }

    public void setFecha_firmeza(Date fecha_firmeza) {
        this.fecha_firmeza = fecha_firmeza;
    }
}
