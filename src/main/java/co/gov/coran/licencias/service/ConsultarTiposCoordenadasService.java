package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ConsultarTiposCoordenadasDTO;
import java.math.BigDecimal;
import java.util.List;

public interface ConsultarTiposCoordenadasService {
    List<ConsultarTiposCoordenadasDTO> consultarTiposCoordenadas(BigDecimal niSecEEta, String viUsuario);
}
