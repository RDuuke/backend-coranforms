package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AntecedenteExiste;
import co.gov.coran.licencias.models.dto.AntecedentesDTO;
import co.gov.coran.licencias.models.dto.ListaAgregadosAntecedente;
import co.gov.coran.licencias.models.dto.ListaAntecedente;
import co.gov.coran.licencias.repository.AntecedentesConsultaRepository;
import co.gov.coran.licencias.service.AntecedentesAgregadosService;
import co.gov.coran.licencias.service.AntecedentesConsultaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class AntecedentesAgregadosServiceImpl implements AntecedentesAgregadosService {

    private AntecedentesConsultaRepository antecedentesConsultaRepository;
    public AntecedentesAgregadosServiceImpl(AntecedentesConsultaRepository antecedentesConsultaRepository){
        this.antecedentesConsultaRepository=antecedentesConsultaRepository;
    }

    @Override
    public ListaAgregadosAntecedente listaAgregadosAntecedente(BigDecimal niSecEETA) {

        ListaAgregadosAntecedente listaAgregadosAntecedente = new ListaAgregadosAntecedente();
        List<Object> objects = antecedentesConsultaRepository.listaAgregadosAntecedente(niSecEETA);
        List<AntecedentesDTO> antecedentes = new ArrayList<>();

        for (Object antededente : objects){
            listaAgregadosAntecedente.setResult(Boolean.TRUE);
            Object[] antecedeAux =(Object[]) antededente;

            AntecedentesDTO antecedentesDTO = new AntecedentesDTO();

            antecedentesDTO.setDoc_sec((BigDecimal) antecedeAux[0]);
            antecedentesDTO.setRadicado((String) antecedeAux[1]);
            antecedentesDTO.setFecha(String.valueOf(antecedeAux[2]));
            antecedentesDTO.setTipo_documento((String) antecedeAux[3]);
            antecedentesDTO.setDescriptor(String.valueOf(antecedeAux[4]));
            antecedentesDTO.setLink_descarga(String.valueOf(antecedeAux[5]));
            antecedentesDTO.setFecha_notificacion(String.valueOf(antecedeAux[6]));

            antecedentes.add(antecedentesDTO);
        }
        listaAgregadosAntecedente.setLista_antecedentes(antecedentes);
        return listaAgregadosAntecedente;
    }


}
