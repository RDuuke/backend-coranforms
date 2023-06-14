package co.gov.coran.licencias.models.dto;

import java.util.List;

public class SituacionLista {

    private Boolean result;
    private List<SituacionConsultaDTO> list_situacion;

    public SituacionLista(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<SituacionConsultaDTO> getList_situacion() {
        return list_situacion;
    }

    public void setList_situacion(List<SituacionConsultaDTO> list_situacion) {
        this.list_situacion = list_situacion;
    }
}
