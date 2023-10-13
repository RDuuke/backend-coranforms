package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.SituacionGuardarDTO;
import co.gov.coran.licencias.repository.SituacionGuardarRepository;
import co.gov.coran.licencias.service.SituacionGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SituacionGuardarServiceImpl implements SituacionGuardarService {
    private final SituacionGuardarRepository situacionGuardarRepository;
    @Autowired
    public SituacionGuardarServiceImpl(SituacionGuardarRepository situacionGuardarRepository) {
        this.situacionGuardarRepository = situacionGuardarRepository;
    }
    @Override
    public SituacionGuardarDTO guardarSituacionEncontrada(SituacionGuardarDTO situacionGuardarDTO) {
        return situacionGuardarRepository.guardarSituacionE(situacionGuardarDTO);
    }
}