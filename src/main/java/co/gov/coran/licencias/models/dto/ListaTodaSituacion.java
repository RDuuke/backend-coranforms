package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaTodaSituacion {
    private Boolean result;
    private List<TodaSituacionDTO>lista_todaSituacion;

    public  ListaTodaSituacion(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<TodaSituacionDTO> getLista_todaSituacion() {
        return lista_todaSituacion;
    }

    public void setLista_todaSituacion(List<TodaSituacionDTO> lista_todaSituacion) {
        this.lista_todaSituacion = lista_todaSituacion;
    }
}
