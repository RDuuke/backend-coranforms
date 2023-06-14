package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaColabora {
    private Boolean result;
    private List<ColaboracionDTO> list_colaboradores;

    public ListaColabora(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ColaboracionDTO> getList_colaboradores() {
        return list_colaboradores;
    }

    public void setList_colaboradores(List<ColaboracionDTO> list_colaboradores) {
        this.list_colaboradores = list_colaboradores;
    }
}
