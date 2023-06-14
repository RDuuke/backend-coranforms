package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListasActos {
    private Boolean result;
    List<ActosExpedientesDTO>lista_actos;

    public ListasActos (){this.result= false;}
    public Boolean getResult(){return result;}


    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ActosExpedientesDTO> getLista_actos() {
        return lista_actos;
    }

    public void setLista_actos(List<ActosExpedientesDTO> lista_actos) {
        this.lista_actos = lista_actos;
    }
}
