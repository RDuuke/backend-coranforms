package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaFirmantes {

    private Boolean result;
    private List<ListaFirmantesDTO> lista_firmas;

    public ListaFirmantes() {}

    public Boolean getResult(){return result;}

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ListaFirmantesDTO> getLista_firmas() {
        return lista_firmas;
    }

    public void setLista_firmas(List<ListaFirmantesDTO> lista_firmas) {
        this.lista_firmas = lista_firmas;
    }




}
