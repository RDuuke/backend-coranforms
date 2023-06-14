package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaTodoAspect;

import java.math.BigDecimal;

public interface TodoAspectService {
    ListaTodoAspect listaTodoAspect(BigDecimal niSecEEta);
}
