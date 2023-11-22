package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
public interface InformacionBasicaService {
    InformacionBasicaDTO listaDatosBasicos(Double niSecEEta, String viIdUsuario);
}

