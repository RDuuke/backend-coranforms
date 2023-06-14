package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.AntecedenteExiste;
import co.gov.coran.licencias.models.dto.ListaAntecedente;

import java.math.BigDecimal;

public interface AntecedentesConsultaService {

    ListaAntecedente listaAntecedente(BigDecimal niSecEETA);
    AntecedenteExiste antecedenteExiste(BigDecimal niSecEETA);
}
