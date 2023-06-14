package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AntecedenteGeneralDTO;
import co.gov.coran.licencias.repository.GuardarGeneralAntRepositry;
import co.gov.coran.licencias.service.GuardarGeneralAntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarGeneralAntImpl implements GuardarGeneralAntService {
    @Autowired
    private GuardarGeneralAntRepositry guardarGeneralAntRepositry;

    @Override
    public AntecedenteGeneralDTO guardarGeneralAn(AntecedenteGeneralDTO antecedenteGeneralDTO) {
        return guardarGeneralAntRepositry.guardarGeneralAn(antecedenteGeneralDTO);
    }
}
