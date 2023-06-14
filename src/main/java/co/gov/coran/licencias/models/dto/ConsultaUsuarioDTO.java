package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;

public class ConsultaUsuarioDTO {

  private BigDecimal sec;
  private String documento;
  private String Nombres;

    public BigDecimal getSec() {
        return sec;
    }

    public void setSec(BigDecimal sec) {
        this.sec = sec;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }
}
