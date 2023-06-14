package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ListaFirmantes;
import co.gov.coran.licencias.models.dto.ListaFirmantesDTO;
import co.gov.coran.licencias.repository.ConsultarFirmaRepository;
import co.gov.coran.licencias.service.ConsultaFirmanteService;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.sql.rowset.serial.SerialBlob;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaFirmasServiceImpl implements ConsultaFirmanteService {

    @Autowired
    private ConsultarFirmaRepository consultarFirmaRepository;

    public ConsultaFirmasServiceImpl(ConsultarFirmaRepository consultarFirmaRepository){
        this.consultarFirmaRepository = consultarFirmaRepository;
    }

    public ListaFirmantes listaFirmantes(BigDecimal niSecEETA) {

        ListaFirmantes listaFirmantes = new ListaFirmantes();
        List<Object> objects = ConsultarFirmaRepository.listaFirmantes(niSecEETA);
        List<ListaFirmantesDTO> firmas = new ArrayList<>();

        for (Object firma : objects){
            listaFirmantes.setResult(Boolean.TRUE);
            Object[] firmaAux =(Object[]) firma;

            ListaFirmantesDTO listaFirmantesDTO = new ListaFirmantesDTO();

            listaFirmantesDTO.setId_usuario((String) firmaAux[0]);
            listaFirmantesDTO.setSec((BigDecimal) firmaAux[1]);
            listaFirmantesDTO.setDocumento((String) firmaAux[2]);
            listaFirmantesDTO.setNombre((String) firmaAux[3]);
            listaFirmantesDTO.setCargo((String) firmaAux[4]);

            try{
                Blob blob = new SerialBlob( (Blob) firmaAux[5] );
                listaFirmantesDTO.setFirma(blob);
            }catch (Exception e){}

            listaFirmantesDTO.setCantidad_horas((BigDecimal) firmaAux[6]);
            listaFirmantesDTO.setCantidad_mins((BigDecimal) firmaAux[7]);

            firmas.add(listaFirmantesDTO);
        }
        listaFirmantes.setLista_firmas(firmas);
        return listaFirmantes;
    }


    public ListaFirmantes listaFirmante(String viIdUsuario) {
        ListaFirmantes listaFirmantes = new ListaFirmantes();
        List<Object> objects = ConsultarFirmaRepository.listaFirmante(viIdUsuario);
        List<ListaFirmantesDTO> firmas = new ArrayList<>();

        for (Object firma : objects){
            listaFirmantes.setResult(Boolean.TRUE);
            Object[] firmaAux =(Object[]) firma;

            ListaFirmantesDTO listaFirmantesDTO = new ListaFirmantesDTO();

            listaFirmantesDTO.setSec((BigDecimal) firmaAux[1]);
            listaFirmantesDTO.setDocumento((String) firmaAux[2]);
            listaFirmantesDTO.setNombre((String) firmaAux[0]);
            listaFirmantesDTO.setCargo((String) firmaAux[3]);

            try{
                Blob blob = new SerialBlob( (Blob) firmaAux[4] );
                listaFirmantesDTO.setFirma(blob);
            }catch (Exception e){}



            firmas.add(listaFirmantesDTO);
        }
        listaFirmantes.setLista_firmas(firmas);
        return listaFirmantes;
    }

    private static byte[] serialize(Object object) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(object);
        oos.close();
        return baos.toByteArray();
    }


    
}
