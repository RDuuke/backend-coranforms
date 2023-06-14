package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaAnalisis {

    private Boolean result;
    private List<AnalisisDTO> list_analisis;

    public ListaAnalisis(){}
    public Boolean getResult(){return result;}
    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<AnalisisDTO> getList_analisis() {return list_analisis;}

    public void setList_analisis(List<AnalisisDTO> list_analisis) {
        this.list_analisis = list_analisis;
    }
}
