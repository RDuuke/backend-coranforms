package co.gov.coran.licencias.models.dto;

import java.util.List;

public class Recomienda {
    private Boolean result;
    private List<RecomiendaConsultaDTO> recomienda;

    public Recomienda(){}

    public Boolean getResult() {return result;}

    public void setResult(Boolean result) {this.result = result;}

    public List<RecomiendaConsultaDTO> getRecomienda() {return recomienda;}

    public void setRecomienda(List<RecomiendaConsultaDTO> recomienda) {this.recomienda = recomienda;}
}
