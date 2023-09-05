package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.models.dto.ListaColabora;

import java.math.BigDecimal;
import java.util.List;

public interface ConsultaAfectacionAmbientalService {

    List<ConsultarTiposAgentePeligroDTO> listaAfectacionesAmbientales(BigDecimal niSecEEta, BigDecimal niLinea);


}
