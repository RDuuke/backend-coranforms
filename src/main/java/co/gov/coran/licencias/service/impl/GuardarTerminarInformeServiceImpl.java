package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarTerminarInformeDTO;
import co.gov.coran.licencias.repository.GuardarTerminarInformeRepository;
import co.gov.coran.licencias.service.GuardarTerminarInformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarTerminarInformeServiceImpl implements GuardarTerminarInformeService {
    @Autowired
    private GuardarTerminarInformeRepository guardarTerminarInformeRepository;
    @Override
    public GuardarTerminarInformeDTO guardarTerInforme(GuardarTerminarInformeDTO guardarTerminarInformeDTO) {
        return guardarTerminarInformeRepository.guardarTerminarInforme(guardarTerminarInformeDTO);
    }
}
