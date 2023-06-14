package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaAnalisis;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface AnalisisConsultaService {
    ListaAnalisis listaAnalisis(BigDecimal niSecEEta);
}
