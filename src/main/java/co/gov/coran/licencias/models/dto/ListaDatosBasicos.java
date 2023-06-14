package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaDatosBasicos {

    private Boolean result;
    private List<InformacionBasicaDTO> lista_datosBasicos;

    public ListaDatosBasicos(){this.result =false;}
    public Boolean getResult(){ return result;}

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<InformacionBasicaDTO> getLista_datosBasicos() {
        return lista_datosBasicos;
    }

    public void setLista_datosBasicos(List<InformacionBasicaDTO> lista_datosBasicos) {
        this.lista_datosBasicos = lista_datosBasicos;
    }
}
