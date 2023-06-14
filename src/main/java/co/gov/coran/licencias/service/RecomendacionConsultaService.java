package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.Conclusion;
import co.gov.coran.licencias.models.dto.Recomienda;

import java.math.BigDecimal;

public interface RecomendacionConsultaService {
    Recomienda recomienda(BigDecimal niSecEEta);
    Conclusion conclusion(BigDecimal niSecEEta);
}
