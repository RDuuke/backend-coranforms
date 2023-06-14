package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.RecomendacionDTO;
import co.gov.coran.licencias.repository.ConclusionGuardarRepository;
import co.gov.coran.licencias.repository.TextoGuardarRepository;
import co.gov.coran.licencias.service.RecomendacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecomendacionGuardarImpl implements RecomendacionService {
    @Autowired
    private TextoGuardarRepository textoGuardarRepository;
    private ConclusionGuardarRepository conclusionGuardarRepository;

    RecomendacionGuardarImpl(TextoGuardarRepository textoGuardarRepository){
        this.textoGuardarRepository = textoGuardarRepository;
    }

    @Override
    public RecomendacionDTO guardarRecomendacion(RecomendacionDTO recomendacionDTO) {
        return textoGuardarRepository.guardarRecomendacion(recomendacionDTO);
    }

    @Override
    public RecomendacionDTO guardarConclusion(RecomendacionDTO recomendacionDTO) {
        return textoGuardarRepository.guardarConclusion(recomendacionDTO);
    }
}
