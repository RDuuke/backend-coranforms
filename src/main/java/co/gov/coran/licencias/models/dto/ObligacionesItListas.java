package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ObligacionesItListas {

    private Boolean result;

    List<ObligacionesItDTO>lista_obligacionesIt;

    public ObligacionesItListas (){this.result = false;}
    public Boolean getResult(){return result;}

    public  void  setResult(Boolean result){this.result= result;}
    public  List<ObligacionesItDTO> getLista_obligacionesIt(){return lista_obligacionesIt; }

    public void setLista_obligacionesIt(List<ObligacionesItDTO> lista_obligacionesIt) {
        this.lista_obligacionesIt = lista_obligacionesIt;
    }
}
