package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.repository.ConsultaAfectacionAmbientalRepository;
import co.gov.coran.licencias.service.ConsultaAfectacionAmbientalService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultaAfectacionAmbientalImpl implements ConsultaAfectacionAmbientalService {

    ConsultaAfectacionAmbientalRepository consultaAfectacionAmbientalRepository;

    public ConsultaAfectacionAmbientalImpl(ConsultaAfectacionAmbientalRepository consultaAfectacionAmbientalRepository) {
        this.consultaAfectacionAmbientalRepository = consultaAfectacionAmbientalRepository;
    }

    @Override
    public List<ConsultarTiposAgentePeligroDTO> listaAfectacionesAmbientales(BigDecimal niSecEEta, BigDecimal niLinea) {
        List<Object> objects = this.consultaAfectacionAmbientalRepository.listaAfectacionesAmbientales(niSecEEta, niLinea);
        List<ConsultarTiposAgentePeligroDTO> tiposAgentePeligroDTOArrayLists = new ArrayList<>();

        for(Object agentpropelling: objects){
            Object[] agente =(Object[]) agentpropelling;

            ConsultarTiposAgentePeligroDTO tiposAgentePeligro = new ConsultarTiposAgentePeligroDTO();
            tiposAgentePeligro.setCodigo((String) agente[0]);
            tiposAgentePeligro.setNombre((String) agente[1]);
            tiposAgentePeligro.setCategoria((String) agente[2]);
            tiposAgentePeligro.setCreado_por((String) agente[3]);
            tiposAgentePeligro.setFecha_creacion((Date) agente[4]);

            tiposAgentePeligroDTOArrayLists.add(tiposAgentePeligro);

        }

        return tiposAgentePeligroDTOArrayLists;
    }
}
