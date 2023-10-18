package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.repository.BorrarAntecenteRepository;
import co.gov.coran.licencias.service.BorrarAntecedenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarAntecedenteImpl implements BorrarAntecedenteService {
    @Autowired
    private BorrarAntecenteRepository borrarAntecenteRepository;
    public String borrarAntecedente(BorrarAntecedenteDTO borrarAntecedenteDTO){
       return this.borrarAntecenteRepository.borrarAntecedente(borrarAntecedenteDTO);
    }
}
