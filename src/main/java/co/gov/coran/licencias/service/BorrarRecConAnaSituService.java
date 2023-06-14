package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.BorrarRecConAnaSituacionDTO;

public interface BorrarRecConAnaSituService {
     String borrarRecConAnaSit(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO);
     String borrarConclusion(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO);
     String borrarAnalisis(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO);
     String borrarSitu(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO);
}
