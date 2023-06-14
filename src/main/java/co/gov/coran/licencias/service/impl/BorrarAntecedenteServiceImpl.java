package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarAntecedenteRequestDTO;
import co.gov.coran.licencias.repository.AntecedentesConsultaRepository;
import co.gov.coran.licencias.service.BorrarAntecedentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarAntecedenteServiceImpl implements BorrarAntecedentesService {

    @Autowired
    private AntecedentesConsultaRepository antecedentesConsultaRepository;

    @Override
    public String borrarAntecedentes(GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO) {
        return antecedentesConsultaRepository.borrarAntecedentes(guardarAntecedenteRequestDTO);
    }
}
