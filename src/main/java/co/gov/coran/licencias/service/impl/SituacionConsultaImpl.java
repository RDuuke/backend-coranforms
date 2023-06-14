package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.SituacionConsultaDTO;
import co.gov.coran.licencias.models.dto.SituacionLista;
import co.gov.coran.licencias.repository.SituacionConsultaRepository;
import co.gov.coran.licencias.service.SituacionConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SituacionConsultaImpl implements SituacionConsultaService {
    @Autowired
    private SituacionConsultaRepository situacionConsultaRepository;

    public SituacionConsultaImpl( SituacionConsultaRepository situacionConsultaRepository){
       this.situacionConsultaRepository = situacionConsultaRepository;
    }

    @Override
    public SituacionLista situacionLista(BigDecimal niSecEEta, Integer niLineaObliga) {
        SituacionLista situacionLista = new SituacionLista();
        List<Object> objects = SituacionConsultaRepository.situacionLista(niSecEEta,niLineaObliga);
        List<SituacionConsultaDTO> situacionEncontrada = new ArrayList<>();

         for( Object situOb : objects){
            situacionLista.setResult(Boolean.TRUE);
            Object[] situAx = (Object[] ) situOb;

            SituacionConsultaDTO situacionConsultaDTO = new SituacionConsultaDTO();

            situacionConsultaDTO.setLinea((BigDecimal) situAx[0]);
            situacionConsultaDTO.setExpobl_linea((BigDecimal) situAx[1]);
            Clob lob = (Clob) situAx[3];
            situacionConsultaDTO.setTexto(clobToString(lob));
            try{
                Clob lobs = (Clob)(situAx[2] ) ;
                situacionConsultaDTO.setImagenes(clobToString(lobs));

            }catch (Exception e){}

            situacionConsultaDTO.setTipo((String) situAx[4]);
            situacionConsultaDTO.setSistema_coordenadas((BigDecimal) situAx[5]);
            situacionConsultaDTO.setX((BigDecimal) situAx[6]);
            situacionConsultaDTO.setY((BigDecimal) situAx[7]);
            situacionConsultaDTO.setTitulo((String) situAx[8]);
            situacionConsultaDTO.setCota((BigDecimal) situAx[9]);
            situacionConsultaDTO.setFecha_creacion((Date) situAx[10]);
            situacionConsultaDTO.setCreado_por((String) situAx[11]);
            situacionConsultaDTO.setFecha_modificacion((Date) situAx[12]);
            situacionConsultaDTO.setModificado_por((String) situAx[13]);
            situacionEncontrada.add(situacionConsultaDTO);
        }
        situacionLista.setList_situacion(situacionEncontrada);
        return situacionLista;
    }

    private static byte[] serialize(Object object) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(object);
        oos.close();
        return baos.toByteArray();
    }
    private String clobToString(Clob data) {
        final StringBuilder sb = new StringBuilder();
        try {
            final Reader reader = data.getCharacterStream();
            final BufferedReader br  = new BufferedReader(reader);
            int b;
            while(-1 != (b = br.read()))
            {
                sb.append((char)b);
            }
            br.close();
        } catch (SQLException e)
        {
            System.out.print("SQL. Could not convert CLOB to string");
            return e.toString();
        } catch (IOException e)
        {
            System.out.print("IO. Could not convert CLOB to string");
            return e.toString();
        }
        return sb.toString();
    }
}
