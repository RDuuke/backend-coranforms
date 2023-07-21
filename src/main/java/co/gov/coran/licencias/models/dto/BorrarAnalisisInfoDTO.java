package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class BorrarAnalisisInfoDTO {

    private BigDecimal niSec;

    private BigDecimal nioLinea;

    private String  viIdUsuario;

    private String voError;

    public void setNiSec(BigDecimal niSec){
        this.niSec = niSec;
    }

    public BigDecimal getNiSec() {
        return niSec;
    }


    public void setNioLinea(BigDecimal nioLinea){
        this.nioLinea = nioLinea;
    }

    public BigDecimal getNioLinea(){
        return this.nioLinea;
    }


    public void setViIdUsuario(String viIdUsuario){
        this.viIdUsuario = viIdUsuario;
    }

    public String getViIdUsuario(){
        return viIdUsuario;
    }


    public void setVoError(String voError){
        this.voError = voError;
    }

    public String getVoError(){
        return this.voError;
    }
}
