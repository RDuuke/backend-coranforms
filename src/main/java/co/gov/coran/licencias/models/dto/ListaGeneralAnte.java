package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaGeneralAnte {
    private Boolean result;
    private List<GeneralConsultaDTO> list_Gantecedente;

    public ListaGeneralAnte(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<GeneralConsultaDTO> getList_Gantecedente() {
        return list_Gantecedente;
    }

    public void setList_Gantecedente(List<GeneralConsultaDTO> list_Gantecedente) {
        this.list_Gantecedente = list_Gantecedente;
    }
}
