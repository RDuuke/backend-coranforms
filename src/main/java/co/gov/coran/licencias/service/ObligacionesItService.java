package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ObligacionesItDTO;
import co.gov.coran.licencias.models.dto.ObligacionesItListas;

import java.math.BigDecimal;

public interface ObligacionesItService {

    ObligacionesItListas obligacionesItListas(BigDecimal niSecEETA, String niSecTer);
}
