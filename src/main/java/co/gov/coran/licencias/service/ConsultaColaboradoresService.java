package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaColabora;

import java.math.BigDecimal;

public interface ConsultaColaboradoresService {
    ListaColabora listaColabora(BigDecimal niSecEEta,String viIdUsuario);
}
