package co.gov.coran.licencias.models.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


public class UserDetailsCustom {
    private String vonombrecompleto;

    public void setVonombrecompleto(String vonombrecompleto) {
        this.vonombrecompleto = vonombrecompleto;
    }

    public String getVonombrecompleto() {
        return vonombrecompleto;
    }
}
