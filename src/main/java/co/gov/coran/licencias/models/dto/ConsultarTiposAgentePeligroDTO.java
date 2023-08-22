package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ConsultarTiposAgentePeligroDTO {

     private String voError;
     private List<RegistroDeCoordenadasDTO> coResultados;

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }

    public List<RegistroDeCoordenadasDTO> getCoResultados() {
        return coResultados;
    }

    public void setCoResultados(List<RegistroDeCoordenadasDTO> coResultados) {
        this.coResultados = coResultados;
    }
}
