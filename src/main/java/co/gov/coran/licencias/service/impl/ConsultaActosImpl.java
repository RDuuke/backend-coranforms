package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ActosExpedientesDTO;
import co.gov.coran.licencias.models.dto.ListasActos;
import co.gov.coran.licencias.repository.ConsultarActosExpedienteRepository;
import co.gov.coran.licencias.service.ConsultaActosServicios;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultaActosImpl implements ConsultaActosServicios {
    ConsultarActosExpedienteRepository consultarActosExpedienteRepository;
    ConsultaActosImpl(ConsultarActosExpedienteRepository consultarActosExpedienteRepository){
        this.consultarActosExpedienteRepository = consultarActosExpedienteRepository;
    }

    @Override
    public ListasActos listaActos(BigDecimal niSecExp) {

        ListasActos listasActos = new ListasActos();
        List<Object> objects = consultarActosExpedienteRepository.ListasActos(niSecExp);
        List<ActosExpedientesDTO> Actos = new ArrayList<>();

        for(Object Acto : objects){
            listasActos.setResult(Boolean.TRUE);
            Object[] ActosAux = (Object[]) Acto;

            ActosExpedientesDTO actosExpedientesDTO = new ActosExpedientesDTO();

            actosExpedientesDTO.setSec((BigDecimal) ActosAux[0]);
            actosExpedientesDTO.setRadicado((String) ActosAux[1]);
            actosExpedientesDTO.setFecha((Date) ActosAux[2]);
            actosExpedientesDTO.setDescriptor((String) ActosAux[3]);
            actosExpedientesDTO.setLink_descarga((String) ActosAux[4]);
            actosExpedientesDTO.setFecha_notificacion((Date) ActosAux[5]);
            actosExpedientesDTO.setFecha_firmeza((Date) ActosAux[6]);

            Actos.add(actosExpedientesDTO);
        }
                listasActos.setLista_actos(Actos);
                return listasActos;
    }
}
