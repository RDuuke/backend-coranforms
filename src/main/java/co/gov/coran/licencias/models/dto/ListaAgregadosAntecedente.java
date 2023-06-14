package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaAgregadosAntecedente {

    private Boolean result;
    List<AntecedentesDTO> lista_antecedentes;

    public ListaAgregadosAntecedente (){this.result = false;}
    public Boolean getResult(){return result;}


    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<AntecedentesDTO> getLista_antecedentes() {
        return lista_antecedentes;
    }

    public void setLista_antecedentes(List<AntecedentesDTO> lista_antecedentes) {
        this.lista_antecedentes = lista_antecedentes;
    }
}
