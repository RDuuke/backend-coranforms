package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.List;

public class ConsultarTiposCoordenadasDTO {
    private BigDecimal niSecEEta;
    private String viUsuario;
    private String voError;
    private List<RegistroDeCoordenadasDTO> coResultados;

    public BigDecimal getNiSecEEta() {
        return niSecEEta;
    }

    public void setNiSecEEta(BigDecimal niSecEEta) {
        this.niSecEEta = niSecEEta;
    }

    public String getViUsuario() {
        return viUsuario;
    }

    public void setViUsuario(String viUsuario) {
        this.viUsuario = viUsuario;
    }

    public String getVoError() {
        return voError;
    }

    public void setVoError(String voError) {
        this.voError = voError;
    }

    public List<RegistroDeCoordenadasDTO> getCoResultados() {
        return coResultados;
    }

    public void setCoResultados(List<RegistroDeCoordenadasDTO> coResultados) {
        this.coResultados = coResultados;
    }
}
