package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarNuevoAgentePeligroDTO;
import co.gov.coran.licencias.repository.GuardarNuevoAgentePeligroRepository;
import co.gov.coran.licencias.service.GuardarNuevoAgentePeligroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarNuevoAgentePeligroImpl implements GuardarNuevoAgentePeligroService {

    @Autowired
    private GuardarNuevoAgentePeligroRepository guardarNuevoAgentePeligroRepository;

    @Override
    public GuardarNuevoAgentePeligroDTO guardarNuevoAgentePeligro(GuardarNuevoAgentePeligroDTO nuevoAgentePeligroDTO){

        return guardarNuevoAgentePeligroRepository.guardarNuevoAgentePeligro(nuevoAgentePeligroDTO);

    }

}
