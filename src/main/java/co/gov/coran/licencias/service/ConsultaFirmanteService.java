package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaFirmantes;
import co.gov.coran.licencias.models.dto.ListaFirmantesDTO;

import java.math.BigDecimal;
import java.util.List;

public interface ConsultaFirmanteService {

 ListaFirmantes listaFirmantes(BigDecimal niSecEETA);
 ListaFirmantes listaFirmante(String viIdUsuario);
}
