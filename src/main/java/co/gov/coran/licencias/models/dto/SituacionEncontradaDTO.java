package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

public class SituacionEncontradaDTO {
     private BigDecimal niSecEEta;
		private Integer nioLinea;
		private String viTipo;
		private String niLineaObliga;
		private String viTitulo;
		private BigDecimal niSistemaCoordenadas;
		private BigDecimal niX ;
		private BigDecimal niY;
		private BigDecimal niCota;
		private String ciTexto;
		private String ciImagenes;
		private String viIdUsuario;
		private String voError;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public Integer getNioLinea() {
        return nioLinea;
    }

    public void setNioLinea(Integer nioLinea) {
        this.nioLinea = nioLinea;
    }

    public String getViTipo() {
        return viTipo;
    }

    public void setViTipo(String viTipo) {
        this.viTipo = viTipo;
    }

    public String getNiLineaObliga() {
        return niLineaObliga;
    }

    public void setNiLineaObliga(String niLineaObliga) {
        this.niLineaObliga = niLineaObliga;
    }

    public String getViTitulo() {
        return viTitulo;
    }

    public void setViTitulo(String viTitulo) {
        this.viTitulo = viTitulo;
    }

    public BigDecimal getNiSistemaCoordenadas() {
        return niSistemaCoordenadas;
    }

    public void setNiSistemaCoordenadas(BigDecimal niSistemaCoordenadas) {
        this.niSistemaCoordenadas = niSistemaCoordenadas;
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

    public BigDecimal getNiCota() {
        return niCota;
    }

    public void setNiCota(BigDecimal niCota) {
        this.niCota = niCota;
    }

    public String getCiTexto() {
        return ciTexto;
    }

    public void setCiTexto(String ciTexto) {
        this.ciTexto = ciTexto;
    }

    public String getCiImagenes() {
        return ciImagenes;
    }

    public void setCiImagenes(String ciImagenes) {
        this.ciImagenes = ciImagenes;
    }

    public String getViIdUsuario() {
        return viIdUsuario;
    }

    public void setViIdUsuario(String viIdUsuario) {
        this.viIdUsuario = viIdUsuario;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }
}
