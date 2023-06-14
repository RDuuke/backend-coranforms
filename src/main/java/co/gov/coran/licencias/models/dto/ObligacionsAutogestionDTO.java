package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

public class ObligacionsAutogestionDTO {
     private BigDecimal obliga_linea;
     private String  expediente;
      private String   nombre_responsable;
      private String   email_responsable;
      private String  tele_fijo_responsable;
      private String  tele_celu_responsable;
      private String  radicado_coe;
      private Date fecha_coe;
      private String obliga_descripcion;
      private String obliga_obs;
      private Date  obliga_fecha_creacion;
      private String comoTermina;
      private String ViMotivoParcial;
      private String radicado_resolucion;
      private Date fecha_resolucion;
      private BigDecimal archivo_nro;
      private String archivo_nombre;
      private Blob archivo;
      private String fecha_ingresa_archivo;
      private Date fecha_foto;
      private BigDecimal cordenadas;


    public BigDecimal getObliga_linea() {
        return obliga_linea;
    }

    public void setObliga_linea(BigDecimal obliga_linea) {
        this.obliga_linea = obliga_linea;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getNombre_responsable() {
        return nombre_responsable;
    }

    public void setNombre_responsable(String nombre_responsable) {
        this.nombre_responsable = nombre_responsable;
    }

    public String getEmail_responsable() {
        return email_responsable;
    }

    public void setEmail_responsable(String email_responsable) {
        this.email_responsable = email_responsable;
    }

    public String getTele_fijo_responsable() {
        return tele_fijo_responsable;
    }

    public void setTele_fijo_responsable(String tele_fijo_responsable) {
        this.tele_fijo_responsable = tele_fijo_responsable;
    }

    public String getTele_celu_responsable() {
        return tele_celu_responsable;
    }

    public void setTele_celu_responsable(String tele_celu_responsable) {
        this.tele_celu_responsable = tele_celu_responsable;
    }

    public String getRadicado_coe() {
        return radicado_coe;
    }

    public void setRadicado_coe(String radicado_coe) {
        this.radicado_coe = radicado_coe;
    }

    public Date getFecha_coe() {
        return fecha_coe;
    }

    public void setFecha_coe(Date fecha_coe) {
        this.fecha_coe = fecha_coe;
    }

    public String getObliga_descripcion() {
        return obliga_descripcion;
    }

    public void setObliga_descripcion(String obliga_descripcion) {
        this.obliga_descripcion = obliga_descripcion;
    }

    public String getObliga_obs() {
        return obliga_obs;
    }

    public void setObliga_obs(String obliga_obs) {
        this.obliga_obs = obliga_obs;
    }

    public Date getObliga_fecha_creacion() {
        return obliga_fecha_creacion;
    }

    public void setObliga_fecha_creacion(Date obliga_fecha_creacion) {
        this.obliga_fecha_creacion = obliga_fecha_creacion;
    }

    public String getComoTermina() {
        return comoTermina;
    }

    public void setComoTermina(String comoTermina) {
        this.comoTermina = comoTermina;
    }

    public String getViMotivoParcial() {
        return ViMotivoParcial;
    }

    public void setViMotivoParcial(String viMotivoParcial) {
        ViMotivoParcial = viMotivoParcial;
    }

    public String getRadicado_resolucion() {
        return radicado_resolucion;
    }

    public void setRadicado_resolucion(String radicado_resolucion) {
        this.radicado_resolucion = radicado_resolucion;
    }

    public Date getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(Date fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public BigDecimal getArchivo_nro() {
        return archivo_nro;
    }

    public void setArchivo_nro(BigDecimal archivo_nro) {
        this.archivo_nro = archivo_nro;
    }

    public String getArchivo_nombre() {
        return archivo_nombre;
    }

    public void setArchivo_nombre(String archivo_nombre) {
        this.archivo_nombre = archivo_nombre;
    }

    public Blob getArchivo() {
        return archivo;
    }

    public void setArchivo(Blob archivo) {
        this.archivo = archivo;
    }


    public String getFecha_ingresa_archivo() {
        return fecha_ingresa_archivo;
    }

    public void setFecha_ingresa_archivo(String fecha_ingresa_archivo) {
        this.fecha_ingresa_archivo = fecha_ingresa_archivo;
    }

    public Date getFecha_foto() {
        return fecha_foto;
    }

    public void setFecha_foto(Date fecha_foto) {
        this.fecha_foto = fecha_foto;
    }


    public BigDecimal getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(BigDecimal cordenadas) {
        this.cordenadas = cordenadas;
    }
}
