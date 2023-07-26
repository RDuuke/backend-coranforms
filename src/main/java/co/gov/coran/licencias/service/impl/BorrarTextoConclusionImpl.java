package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarTextoConclusionDTO;
import co.gov.coran.licencias.repository.BorrarTextoConclusionRepository;
import co.gov.coran.licencias.service.BorrarTextoConclusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarTextoConclusionImpl implements BorrarTextoConclusionService {

    @Autowired
    private BorrarTextoConclusionRepository borrarTextoConclusionRepository;

    @Override
    public String borrarTextoConclusion(BorrarTextoConclusionDTO borrarTextoConclusionDTO){
        return this.borrarTextoConclusionRepository.borrarTextoConclusion(borrarTextoConclusionDTO);
    }

}
