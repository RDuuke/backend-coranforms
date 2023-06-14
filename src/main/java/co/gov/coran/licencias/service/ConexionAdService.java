package co.gov.coran.licencias.service;
import co.gov.coran.licencias.models.dto.AdDTO;
import javax.servlet.http.HttpServletRequest;

public interface ConexionAdService {
    public AdDTO conexionAd(AdDTO adDTO);

}
