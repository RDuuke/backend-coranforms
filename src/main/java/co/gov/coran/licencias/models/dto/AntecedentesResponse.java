package co.gov.coran.licencias.models.dto;

public class AntecedentesResponse {
    private Boolean result = false;
    private String voError;

    public AntecedentesResponse() {

    }

    public AntecedentesResponse(Boolean result, String voError) {
        this.result = result;
        this.voError = voError;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoErro(String voError) {
        this.voError = voError;
    }
}
