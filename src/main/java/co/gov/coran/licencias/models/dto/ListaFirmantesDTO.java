package co.gov.coran.licencias.models.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

public class ListaFirmantesDTO implements Serializable {
    public String id_usuario;
    public BigDecimal sec;
    public String documento;
    public String nombre;
    public String cargo;
    public Blob firma;
    public  BigDecimal cantidad_horas;
    public  BigDecimal cantidad_mins;



    public Blob getFirma() {
        return firma;
    }

    public void setFirma(Blob firma) {
        this.firma = firma;
    }


    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public BigDecimal getSec() {
        return sec;
    }

    public void setSec(BigDecimal sec) {
        this.sec = sec;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public BigDecimal getCantidad_horas() {
        return cantidad_horas;
    }

    public void setCantidad_horas(BigDecimal cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public BigDecimal getCantidad_mins() {
        return cantidad_mins;
    }

    public void setCantidad_mins(BigDecimal cantidad_mins) {
        this.cantidad_mins = cantidad_mins;
    }
}
