package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ProblematicaLista;

import java.math.BigDecimal;

public interface ProblamaConsultaService {

    ProblematicaLista problematicaList(BigDecimal niSecEEta);
}
