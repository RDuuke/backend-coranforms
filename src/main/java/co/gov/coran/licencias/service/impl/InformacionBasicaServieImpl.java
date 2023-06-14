package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
import co.gov.coran.licencias.models.dto.ListaDatosBasicos;
import co.gov.coran.licencias.repository.InformacionBasicaRepository;
import co.gov.coran.licencias.service.InformacionBasicaService;
import oracle.sql.BLOB;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class InformacionBasicaServieImpl implements InformacionBasicaService {

    private InformacionBasicaRepository informacionBasicaRepository;

    public InformacionBasicaServieImpl(InformacionBasicaRepository informacionBasicaRepository){
        this.informacionBasicaRepository= informacionBasicaRepository;
    }


    public InformacionBasicaDTO listaDatosBasicos(Double niSecEEta, String viIdUsuario) {

    List<Object> objects = InformacionBasicaRepository.listaDatosBasicos(niSecEEta,viIdUsuario);

    InformacionBasicaDTO informacionBasicaDTO = objects.stream().map(item ->{
        Object[] value = (Object[]) item;
        InformacionBasicaDTO dto = new InformacionBasicaDTO();
        dto.setNombre_asunto((String) value[0]);
        dto.setCodigo_asunto((String) value[1]);
        dto.setExp_sec(String.valueOf(value[2]));
        dto.setExpediente( String.valueOf (value[3]));
        dto.setNumero_asignacion((String) value[4]);
        dto.setFecha_asignacion(String.valueOf(value[5]));
        dto.setNombre_interesado(String.valueOf(value[6]));
        dto.setDocumento_interesado((String) value[7]);
        dto.setExpedientes_relacionados((String) value[8]);
        dto.setMunicipio((String) value[9]);
        dto.setDoc_sec_radicado(String.valueOf(value[10]));
        dto.setRadicado((String) value[11]);
        dto.setDoc_fecha((Date) value[12]);
        dto.setNumero_visita((String) value[13]);
        dto.setFecha_realiza_visita((Date) value[14]);
        dto.setHoras_duracion_visita((BigDecimal) value[15]);
        dto.setTrasporte_visita((String) value[16]);
        dto.setAcompagnantes_visita((String) value[17]);
        dto.setEs_autogestion(String.valueOf(value[18]));
        dto.setAgregar_coordenadas_cs(String.valueOf(value[19]));

        return dto;
    }).findFirst().get();
        return informacionBasicaDTO;
    }



}
