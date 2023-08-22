package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.models.dto.ListaObligaciones;
import co.gov.coran.licencias.models.dto.ObligacionsAutogestionDTO;
import co.gov.coran.licencias.models.dto.RegistroDeCoordenadasDTO;
import co.gov.coran.licencias.repository.ConsultarTiposAgentePeligroRepository;
import co.gov.coran.licencias.service.ConsultarTiposAgentePeligroService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultarTiposAgentePeligroImpl implements ConsultarTiposAgentePeligroService {

    private ConsultarTiposAgentePeligroRepository consultarTiposAgentePeligroRepository;

    public ConsultarTiposAgentePeligroImpl(ConsultarTiposAgentePeligroRepository consultarTiposAgentePeligroRepository){
        this.consultarTiposAgentePeligroRepository = consultarTiposAgentePeligroRepository;
    }
    @Override
    public ConsultarTiposAgentePeligroDTO listaTiposAgentePeligro(String categoria){

        ConsultarTiposAgentePeligroDTO consultarTiposAgentePeligroDTO = new ConsultarTiposAgentePeligroDTO();
        List<Object> objects = consultarTiposAgentePeligroRepository.listaTiposAgentePeligro(categoria);
        List<RegistroDeCoordenadasDTO> coordenadas = new ArrayList<>();

        for(Object coordenada: objects){
            Object[] coordenadaAux= (Object[]) coordenada;
            RegistroDeCoordenadasDTO registroDeCoordenadasDTO = new RegistroDeCoordenadasDTO();
            registroDeCoordenadasDTO.setCodigo((String) coordenadaAux[0]);

            registroDeCoordenadasDTO.setNombre((String) coordenadaAux[1]);
            registroDeCoordenadasDTO.setCategoria((String) coordenadaAux[2]);
            registroDeCoordenadasDTO.setCreado_por((String) coordenadaAux[3]);
            registroDeCoordenadasDTO.setFecha_creacion((Date) coordenadaAux[4]);

            coordenadas.add(registroDeCoordenadasDTO);

        }

        consultarTiposAgentePeligroDTO.setCoResultados(coordenadas);

        return consultarTiposAgentePeligroDTO;

    }
}
