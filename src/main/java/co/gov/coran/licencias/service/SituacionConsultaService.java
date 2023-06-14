package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.SituacionLista;

import java.math.BigDecimal;

public interface SituacionConsultaService {
    SituacionLista situacionLista(BigDecimal niSecEEta, Integer niLineaObliga);
}
