package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaArchivos {
    private List<ListaFirmantesDTO> firmas;

    public List<ListaFirmantesDTO> getListaFirmante() {
        return firmas;
    }

    public void setListaFirmante(List<ListaFirmantesDTO> firmas) {
        this.firmas = firmas;
    }
}
