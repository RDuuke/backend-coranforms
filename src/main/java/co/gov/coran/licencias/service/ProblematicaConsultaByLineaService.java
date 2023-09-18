package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;

import java.math.BigDecimal;

public interface ProblematicaConsultaByLineaService {

    ProblematicaGuardarDTO problematicaItem(BigDecimal niSecEEta, BigDecimal niLinea);

}
