package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AntecedenteExiste;
import co.gov.coran.licencias.models.dto.AntecedentesDTO;
import co.gov.coran.licencias.models.dto.ListaAntecedente;
import co.gov.coran.licencias.repository.AntecedentesConsultaRepository;
import co.gov.coran.licencias.service.AntecedentesConsultaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultaAntecedenteImpl implements AntecedentesConsultaService {

    private AntecedentesConsultaRepository antecedentesConsultaRepository;
    public ConsultaAntecedenteImpl(AntecedentesConsultaRepository antecedentesConsultaRepository){
        this.antecedentesConsultaRepository =antecedentesConsultaRepository;
    }

    @Override
    public ListaAntecedente listaAntecedente(BigDecimal niSecEETA) {

        ListaAntecedente listaAntecedente = new ListaAntecedente();
        List<Object> objects = antecedentesConsultaRepository.listaAntecedente(niSecEETA);
        List<AntecedentesDTO> antecedentes = new ArrayList<>();

        for (Object antededente : objects){
            listaAntecedente.setResult(Boolean.TRUE);
            Object[] antecedeAux =(Object[]) antededente;

            AntecedentesDTO antecedentesDTO = new AntecedentesDTO();

            antecedentesDTO.setDoc_sec((BigDecimal) antecedeAux[0]);
            antecedentesDTO.setRadicado((String) antecedeAux[1]);
            antecedentesDTO.setFecha(String.valueOf(antecedeAux[2]));
            antecedentesDTO.setTipo_documento((String) antecedeAux[3]);
            antecedentesDTO.setDescriptor(String.valueOf(antecedeAux[4]));
            antecedentesDTO.setLink_descarga((String) antecedeAux[5]);
            antecedentesDTO.setFecha_notificacion(String.valueOf(antecedeAux[6]));

            antecedentes.add(antecedentesDTO);
        }
        listaAntecedente.setLista_antecedentes(antecedentes);
        return listaAntecedente;
    }

    @Override
    public AntecedenteExiste antecedenteExiste(BigDecimal niSecEETA) {

        AntecedenteExiste antecedenteExiste = new AntecedenteExiste();
        List<Object> objects = antecedentesConsultaRepository.antecedenteExiste(niSecEETA);
        List<AntecedentesDTO> antecedentes = new ArrayList<>();

        for (Object antededente : objects){
            antecedenteExiste.setResult(Boolean.TRUE);
            Object[] antecedeAux =(Object[]) antededente;

            AntecedentesDTO antecedentesDTO = new AntecedentesDTO();

            antecedentesDTO.setDoc_sec((BigDecimal) antecedeAux[0]);
            antecedentesDTO.setRadicado((String) antecedeAux[1]);
            antecedentesDTO.setFecha(String.valueOf(antecedeAux[2]));
            antecedentesDTO.setTipo_documento((String) antecedeAux[3]);
            antecedentesDTO.setDescriptor(String.valueOf(antecedeAux[4]));
            antecedentesDTO.setLink_descarga((String) antecedeAux[5]);
            antecedentesDTO.setFecha_notificacion(String.valueOf(antecedeAux[6]));

            antecedentes.add(antecedentesDTO);
        }
        antecedenteExiste.setLista_antecedentes(antecedentes);
        return antecedenteExiste;
    }
}
