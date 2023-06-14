package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarRecConAnaSituacionDTO;
import co.gov.coran.licencias.repository.BorrarSituRecConclusionRepository;
import co.gov.coran.licencias.service.BorrarRecConAnaSituService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarRecConAnaSituImpl implements BorrarRecConAnaSituService {
     @Autowired
     BorrarSituRecConclusionRepository borrarSituRecConclusionRepository;
     @Override
     public String borrarRecConAnaSit(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO) {
          return borrarSituRecConclusionRepository.borrarRecConAnaSit(borrarRecConAnaSituacionDTO);
     }

     @Override
     public String borrarConclusion(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO) {
          return borrarSituRecConclusionRepository.borrarConclusion(borrarRecConAnaSituacionDTO);
     }

     @Override
     public String borrarAnalisis(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO) {
          return borrarSituRecConclusionRepository.borrarAnalisis(borrarRecConAnaSituacionDTO);
     }

     @Override
     public String borrarSitu(BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO) {
          return borrarSituRecConclusionRepository.borrarSitu(borrarRecConAnaSituacionDTO);
     }
}
