package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
import co.gov.coran.licencias.models.dto.ListaDatosBasicos;

import java.math.BigDecimal;

public interface InformacionBasicaService {

   // ListaDatosBasicos listarDatosBasicos(Double sequenceAsigna, String viIdUsuario );
    InformacionBasicaDTO listaDatosBasicos(Double niSecEEta, String viIdUsuario);
}

