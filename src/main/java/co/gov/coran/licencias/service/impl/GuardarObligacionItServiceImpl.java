package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarObligacionItDTO;
import co.gov.coran.licencias.repository.Consultar_obliga_itRepository;
import co.gov.coran.licencias.service.GuardarObligacionItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarObligacionItServiceImpl implements GuardarObligacionItService {
    @Autowired
    private Consultar_obliga_itRepository consultar_obliga_itRepository;

    @Override
    public GuardarObligacionItDTO guardarObigaIt(GuardarObligacionItDTO guardarObligacionItDTO) {
        return consultar_obliga_itRepository.guardarObigaIt(guardarObligacionItDTO);
    }
}
