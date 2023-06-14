package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaTodoAspect {
    private Boolean result;
    private List<TodosAspectDTO>lista_todoAspect;


    public ListaTodoAspect() {}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<TodosAspectDTO> getLista_todoAspect() {
        return lista_todoAspect;
    }

    public void setLista_todoAspect(List<TodosAspectDTO> lista_todoAspect) {
        this.lista_todoAspect = lista_todoAspect;
    }
}
