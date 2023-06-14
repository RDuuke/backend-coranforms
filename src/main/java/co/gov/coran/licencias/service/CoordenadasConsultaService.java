package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaCoordenadas;

import java.math.BigDecimal;

public interface CoordenadasConsultaService {

    ListaCoordenadas listaCoordenadas(BigDecimal niSecEETA, String viUsuario);
}
