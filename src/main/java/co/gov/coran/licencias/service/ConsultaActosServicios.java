package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListasActos;

import java.math.BigDecimal;

public interface ConsultaActosServicios {
    ListasActos listaActos(BigDecimal niSecExp );
}
