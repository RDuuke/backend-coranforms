package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class EditarCoordenadasDTO {

    public BigDecimal niSecEEta;
    public String viUsuario;
    public String  niLinea;
    public String niSecCaptacion;
    public  String niSecVertimiento;
    public  BigDecimal niSistemaCoorde;
    public BigDecimal niX;
    public BigDecimal niY;
    public String viTipoCoorde;
    public String  viDescripcion;
    public  String viObservaciones;
    public String  voError;


    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public String getViUsuario() {
        return viUsuario;
    }

    public void setViUsuario(String viUsuario) {
        this.viUsuario = viUsuario;
    }

    public String getNiLinea() {
        return niLinea;
    }

    public void setNiLinea(String niLinea) {
        this.niLinea = niLinea;
    }

    public String getNiSecCaptacion() {
        return niSecCaptacion;
    }

    public void setNiSecCaptacion(String niSecCaptacion) {
        this.niSecCaptacion = niSecCaptacion;
    }

    public String getNiSecVertimiento() {
        return niSecVertimiento;
    }

    public void setNiSecVertimiento(String niSecVertimiento) {
        this.niSecVertimiento = niSecVertimiento;
    }

    public BigDecimal getNiSistemaCoorde() {
        return niSistemaCoorde;
    }

    public void setNiSistemaCoorde(BigDecimal niSistemaCoorde) {
        this.niSistemaCoorde = niSistemaCoorde;
    }

    public BigDecimal getNiX() {
        return niX;
    }

    public void setNiX(BigDecimal niX) {
        this.niX = niX;
    }

    public BigDecimal getNiY() {
        return niY;
    }

    public void setNiY(BigDecimal niY) {
        this.niY = niY;
    }

    public String getViTipoCoorde() {
        return viTipoCoorde;
    }

    public void setViTipoCoorde(String viTipoCoorde) {
        this.viTipoCoorde = viTipoCoorde;
    }

    public String getViDescripcion() {
        return viDescripcion;
    }

    public void setViDescripcion(String viDescripcion) {
        this.viDescripcion = viDescripcion;
    }

    public String getViObservaciones() {
        return viObservaciones;
    }

    public void setViObservaciones(String viObservaciones) {
        this.viObservaciones = viObservaciones;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
