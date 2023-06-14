package co.gov.coran.licencias.service.impl;


import co.gov.coran.licencias.models.dto.ListaObligaciones;
import co.gov.coran.licencias.models.dto.ObligacionsAutogestionDTO;
import co.gov.coran.licencias.repository.ConsultaObligaUsuarioRepository;
import co.gov.coran.licencias.service.ConsultaObligacionesAutogestion;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultaObligacionesAutogestionImpl implements ConsultaObligacionesAutogestion {

    private ConsultaObligaUsuarioRepository consultaObligaUsuarioRepository;
    public ConsultaObligacionesAutogestionImpl(ConsultaObligaUsuarioRepository consultaObligaUsuarioRepository){
        this.consultaObligaUsuarioRepository = consultaObligaUsuarioRepository;
    }



    @Override
    public ListaObligaciones listaObligaciones(BigDecimal niSecEETA) {

        ListaObligaciones listaObligaciones = new ListaObligaciones();
        List<Object> objects = consultaObligaUsuarioRepository.listaObligaciones(niSecEETA);
        List<ObligacionsAutogestionDTO> obligaciones = new ArrayList<>();

        for (Object obligacion :objects){
            listaObligaciones.setResult(Boolean.TRUE);
            Object[] obligaAux= (Object[])  obligacion;

            ObligacionsAutogestionDTO obligacionsAutogestionDTO = new ObligacionsAutogestionDTO();
            obligacionsAutogestionDTO.setObliga_linea((BigDecimal) obligaAux[0]);
            obligacionsAutogestionDTO.setExpediente((String) obligaAux[1]);
            obligacionsAutogestionDTO.setNombre_responsable((String) obligaAux[2]);
            obligacionsAutogestionDTO.setEmail_responsable((String) obligaAux[3]);
            obligacionsAutogestionDTO.setTele_fijo_responsable((String) obligaAux[4]);
            obligacionsAutogestionDTO.setTele_celu_responsable((String) obligaAux[5]);
            obligacionsAutogestionDTO.setRadicado_coe((String) obligaAux[6]);
            obligacionsAutogestionDTO.setFecha_coe((Date) obligaAux[7]);
            obligacionsAutogestionDTO.setObliga_descripcion((String) obligaAux[8]);
            obligacionsAutogestionDTO.setObliga_obs((String) obligaAux[9]);
            obligacionsAutogestionDTO.setObliga_fecha_creacion((Date) obligaAux[10]);
            obligacionsAutogestionDTO.setComoTermina((String) obligaAux[11]);
            obligacionsAutogestionDTO.setViMotivoParcial((String) obligaAux[12]);
            obligacionsAutogestionDTO.setRadicado_resolucion((String) obligaAux[13]);
            obligacionsAutogestionDTO.setFecha_resolucion((Date) obligaAux[14]);
            obligacionsAutogestionDTO.setArchivo_nro((BigDecimal) obligaAux[15]);
            obligacionsAutogestionDTO.setArchivo_nombre((String) obligaAux[16]);

            try {
                Blob blob = new SerialBlob( (Blob) obligaAux[17]);
                obligacionsAutogestionDTO.setArchivo((blob) );
            }catch (Exception e){}

            obligacionsAutogestionDTO.setFecha_foto((Date) obligaAux[18]);
            obligacionsAutogestionDTO.setFecha_ingresa_archivo((String) obligaAux[19]);


            obligacionsAutogestionDTO.setCordenadas((BigDecimal) obligaAux[20]);

              obligaciones.add(obligacionsAutogestionDTO);
        }
        listaObligaciones.setLista_obligaciones(obligaciones);
        return listaObligaciones;
    }
}
