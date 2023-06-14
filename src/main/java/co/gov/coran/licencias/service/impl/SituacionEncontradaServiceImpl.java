package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.SituacionEncontradaDTO;
import co.gov.coran.licencias.repository.SituacionEncontradaRepository;
import co.gov.coran.licencias.service.SituacionEncontradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SituacionEncontradaServiceImpl implements SituacionEncontradaService {
    @Autowired
    private SituacionEncontradaRepository situacionEncontradaRepository;
    @Override
    public SituacionEncontradaDTO guardarSituacionE(SituacionEncontradaDTO situacionEncontradaDTO) {

        return situacionEncontradaRepository.guardarSituacionE(situacionEncontradaDTO);
    }
}
