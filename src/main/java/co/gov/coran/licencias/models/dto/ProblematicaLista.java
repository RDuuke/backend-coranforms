package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ProblematicaLista {
    private Boolean result;
    private List<ProblemaConsultaDTO>lista_problema;

    public ProblematicaLista(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ProblemaConsultaDTO> getLista_problema() {
        return lista_problema;
    }

    public void setLista_problema(List<ProblemaConsultaDTO> lista_problema) {
        this.lista_problema = lista_problema;
    }
}
