package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ExpedientDTO;
import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
import co.gov.coran.licencias.models.dto.ListaExpedientes;

public interface ExpedienteService {

    ListaExpedientes listarExpedientes(Integer sequenceThirdParty);


}
