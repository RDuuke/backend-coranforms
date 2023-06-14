package co.gov.coran.licencias.models.dto;

import java.util.List;

public class Conclusion {

    private Boolean result;
    private List<RecomiendaConsultaDTO> conclusion_texto;

    public  Conclusion(){}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<RecomiendaConsultaDTO> getConclusion_texto() {
        return conclusion_texto;
    }

    public void setConclusion_texto(List<RecomiendaConsultaDTO> conclusion_texto) {
        this.conclusion_texto = conclusion_texto;
    }
}
