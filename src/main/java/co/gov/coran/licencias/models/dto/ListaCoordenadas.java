package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaCoordenadas {
    private  Boolean result;
    private List<CoordenadasConsultaDTO>lista_coordenadas;

    public ListaCoordenadas(){}

    public Boolean getResult(){return  result;}

    public void setResult(Boolean result){this.result = result;}

    public List<CoordenadasConsultaDTO> getLista_coordenadas() {
        return lista_coordenadas;
    }

    public void setLista_coordenadas(List<CoordenadasConsultaDTO> lista_coordenadas) {
        this.lista_coordenadas = lista_coordenadas;
    }
}
