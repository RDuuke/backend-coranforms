package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaAgregadosAntecedente;

import java.math.BigDecimal;

public interface AntecedentesAgregadosService {
    ListaAgregadosAntecedente listaAgregadosAntecedente(BigDecimal niSecEETA);
}
