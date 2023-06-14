package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaAsigna {
    private Boolean result;
    List<AsignaDTO> lista_asignaciones;
    public ListaAsigna(){this.result = false;}
    public Boolean getResult(){return result;}


    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<AsignaDTO> getLista_asignaciones() {
        return lista_asignaciones;
    }

    public void setLista_asignaciones(List<AsignaDTO> lista_asignaciones) {
        this.lista_asignaciones = lista_asignaciones;
    }
}
