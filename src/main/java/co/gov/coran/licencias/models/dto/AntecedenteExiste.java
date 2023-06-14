package co.gov.coran.licencias.models.dto;

import java.util.List;

public class AntecedenteExiste {
    private Boolean result;
    List<AntecedentesDTO> AntecedenteExiste;

    public AntecedenteExiste (){this.result = false;}
    public Boolean getResult(){return result;}


    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<AntecedentesDTO> getLista_antecedentes() {
        return AntecedenteExiste;
    }

    public void setLista_antecedentes(List<AntecedentesDTO> lista_antecedentes) {
        this.AntecedenteExiste = lista_antecedentes;
    }
}
