package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaGeneralAnte;

import java.math.BigDecimal;

public interface GeneralConsultaService {
    ListaGeneralAnte listaGeneralAnte(BigDecimal niSecEEta);
}
