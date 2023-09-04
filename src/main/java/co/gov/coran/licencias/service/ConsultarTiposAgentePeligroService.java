package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;

import java.util.List;


public interface ConsultarTiposAgentePeligroService {

    List<ConsultarTiposAgentePeligroDTO> listaTiposAgentePeligro(String categoria);
}
