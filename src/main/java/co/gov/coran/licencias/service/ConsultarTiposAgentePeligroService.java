package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;


public interface ConsultarTiposAgentePeligroService {

    ConsultarTiposAgentePeligroDTO listaTiposAgentePeligro(String categoria);
}
