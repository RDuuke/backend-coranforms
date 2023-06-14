package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class GuardarAntecedenteRequestDTO {
   public Double niSecEEta;
   public Double  niSecDoc;
   public String viIdUsuario;


    public Double getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(Double niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public Double getNiSecDoc() {
        return niSecDoc;
    }

    public void setNiSecDoc(Double niSecDoc) {
        this.niSecDoc = niSecDoc;
    }

    public String getViIdUsuario() {
        return viIdUsuario;
    }

    public void setViIdUsuario(String viIdUsuario) {
        this.viIdUsuario = viIdUsuario;
    }

}
