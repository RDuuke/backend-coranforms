package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class GuardarCoordenadasDTO {

    public BigDecimal niSecEEta;

    public String viUsuario;

    public BigDecimal  niLinea;
    public BigDecimal niSecCaptacion;
    public  BigDecimal niSecVertimiento;
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

    public BigDecimal getNiLinea() {
        return niLinea;
    }

    public void setNiLinea(BigDecimal niLinea) {
        this.niLinea = niLinea;
    }

    public BigDecimal getNiSecCaptacion() {
        return niSecCaptacion;
    }

    public void setNiSecCaptacion(BigDecimal niSecCaptacion) {
        this.niSecCaptacion = niSecCaptacion;
    }

    public BigDecimal getNiSecVertimiento() {
        return niSecVertimiento;
    }

    public void setNiSecVertimiento(BigDecimal niSecVertimiento) {
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
