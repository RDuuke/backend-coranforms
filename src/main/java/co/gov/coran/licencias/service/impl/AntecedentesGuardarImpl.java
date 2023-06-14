package co.gov.coran.licencias.service.impl;


import co.gov.coran.licencias.models.dto.GuardarAntecedenteRequestDTO;
import co.gov.coran.licencias.repository.AntecedentesConsultaRepository;
import co.gov.coran.licencias.service.AntecedenteGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AntecedentesGuardarImpl implements AntecedenteGuardarService {
    @Autowired
    private AntecedentesConsultaRepository antecedentesConsultaRepository;


    @Override
    public String guardarAntecedentes(GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO){
        return antecedentesConsultaRepository.guardarAntecedentes(guardarAntecedenteRequestDTO);
    }
}
