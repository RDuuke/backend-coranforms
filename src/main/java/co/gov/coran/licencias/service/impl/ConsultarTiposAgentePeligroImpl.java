package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.repository.ConsultarTiposAgentePeligroRepository;
import co.gov.coran.licencias.service.ConsultarTiposAgentePeligroService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ConsultarTiposAgentePeligroImpl implements ConsultarTiposAgentePeligroService {

    private ConsultarTiposAgentePeligroRepository consultarTiposAgentePeligroRepository;

    public ConsultarTiposAgentePeligroImpl(ConsultarTiposAgentePeligroRepository consultarTiposAgentePeligroRepository){
        this.consultarTiposAgentePeligroRepository = consultarTiposAgentePeligroRepository;
    }
    public List<ConsultarTiposAgentePeligroDTO> listaTiposAgentePeligro(String categoria){

        List<Object> objects = consultarTiposAgentePeligroRepository.listaTiposAgentePeligro(categoria);
        List<ConsultarTiposAgentePeligroDTO> tiposAgentePeligroDTOArrayLists = new ArrayList<>();

        for(Object agentpropelling: objects){
            System.out.println(agentpropelling.toString());
            Object[] agente =(Object[]) agentpropelling;

            ConsultarTiposAgentePeligroDTO registroDeCoordenadasDTO = new ConsultarTiposAgentePeligroDTO();
            registroDeCoordenadasDTO.setCodigo((String) agente[0]);
            registroDeCoordenadasDTO.setNombre((String) agente[1]);
            registroDeCoordenadasDTO.setCategoria((String) agente[2]);
            registroDeCoordenadasDTO.setCreado_por((String) agente[3]);
            registroDeCoordenadasDTO.setFecha_creacion((Date) agente[4]);

            tiposAgentePeligroDTOArrayLists.add(registroDeCoordenadasDTO);

        }


        return tiposAgentePeligroDTOArrayLists;

    }
}
