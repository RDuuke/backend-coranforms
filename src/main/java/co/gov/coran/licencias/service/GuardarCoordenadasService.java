package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;

import java.util.List;

public interface GuardarCoordenadasService {
    List<GuardarCoordenadasDTO> guardarCoordenadas(List<GuardarCoordenadasDTO> guardarCoordenadasDTOList);
}
