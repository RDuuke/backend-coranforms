package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaAntecedente;
import co.gov.coran.licencias.models.dto.ListaObligaciones;

import java.math.BigDecimal;

public interface ConsultaObligacionesAutogestion {
    ListaObligaciones listaObligaciones(BigDecimal niSecEETA);
}
