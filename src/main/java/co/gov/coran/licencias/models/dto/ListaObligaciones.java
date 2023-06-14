package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaObligaciones {

    private Boolean result;
    List<ObligacionsAutogestionDTO> lista_obligaciones;

    public ListaObligaciones (){this.result = false;}
    public Boolean getResult(){return result;}


    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ObligacionsAutogestionDTO> getLista_obligaciones() {
        return lista_obligaciones;
    }

    public void setLista_obligaciones(List<ObligacionsAutogestionDTO> lista_obligaciones) {
        this.lista_obligaciones = lista_obligaciones;
    }
}
