package co.gov.coran.licencias.models.dto;

import java.util.Date;

public class ColaboracionDTO {
  private String  nombre_asignado;
  private String usuario_asignado;
  private String asignado_por;
  private Date fecha_asignacion;

    public String getNombre_asignado() {
        return nombre_asignado;
    }

    public void setNombre_asignado(String nombre_asignado) {
        this.nombre_asignado = nombre_asignado;
    }

    public String getUsuario_asignado() {
        return usuario_asignado;
    }

    public void setUsuario_asignado(String usuario_asignado) {
        this.usuario_asignado = usuario_asignado;
    }

    public String getAsignado_por() {
        return asignado_por;
    }

    public void setAsignado_por(String asignado_por) {
        this.asignado_por = asignado_por;
    }

    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }
}
