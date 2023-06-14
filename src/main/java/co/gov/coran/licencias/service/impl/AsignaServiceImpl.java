package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AsignaDTO;

import co.gov.coran.licencias.models.dto.ListaAsigna;
import co.gov.coran.licencias.repository.AsignacionesRepository;
import co.gov.coran.licencias.service.AsignaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class AsignaServiceImpl implements AsignaService {
 private AsignacionesRepository asignacionesRepository;
 public  AsignaServiceImpl(AsignacionesRepository asignacionesRepository){
     this.asignacionesRepository= asignacionesRepository;
 }

 public ListaAsigna listaAsigna( String viIdUsuario){
     ListaAsigna listaAsigna = new ListaAsigna();
     List<Object> objects = asignacionesRepository.listaAsigna(viIdUsuario);
     List<AsignaDTO> asignaciones = new ArrayList<>();

     for (Object asig : objects) {
         listaAsigna.setResult(Boolean.TRUE);
         Object[] asignaAux = (Object[]) asig;
         AsignaDTO asignaDTO = new AsignaDTO();

         asignaDTO.setSec((BigDecimal) asignaAux[0] );
         asignaDTO.setExp_sec((BigDecimal) asignaAux[1]);
         asignaDTO.setExpediente((String) asignaAux[2]);
         asignaDTO.setRadicado((String) asignaAux[3]);
         asignaDTO.setNumero_asignacion((String) asignaAux[4]);
         asignaDTO.setTipo_etapa((String) asignaAux[5]);
         asignaDTO.setNom_tipo_actuacion((String) asignaAux[6]);
         asignaDTO.setCod_tipo_actuacion((String) asignaAux[7]);
         asignaDTO.setTipo_tramite((String) asignaAux[8]);
         asignaDTO.setFecha_asignacion((Date) asignaAux[9]);
         asignaDTO.setEstrategia((String) asignaAux[10]);
         asignaDTO.setObservacion((String) asignaAux[11]);
         asignaDTO.setDoc_sec((BigDecimal) asignaAux[12]);

         asignaciones.add(asignaDTO);
     }
    listaAsigna.setLista_asignaciones(asignaciones);

     return listaAsigna;
 }
}
