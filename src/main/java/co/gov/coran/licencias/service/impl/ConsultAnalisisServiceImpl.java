package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AnalisisDTO;
import co.gov.coran.licencias.models.dto.ListaAnalisis;
import co.gov.coran.licencias.repository.ConsultAnalisisRepository;
import co.gov.coran.licencias.service.AnalisisConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultAnalisisServiceImpl implements AnalisisConsultaService {
    @Autowired
    private ConsultAnalisisRepository consultAnalisisRepository;

    public ConsultAnalisisServiceImpl(ConsultAnalisisRepository consultAnalisisRepository){
        this.consultAnalisisRepository = consultAnalisisRepository;
    }


    public ListaAnalisis listaAnalisis(BigDecimal niSecEEta){
        ListaAnalisis listaAnalisis = new ListaAnalisis();
        List<Object> objects = ConsultAnalisisRepository.listaAnalisis(niSecEEta);
        List<AnalisisDTO> analisis = new ArrayList<>();

        for( Object analisisOb : objects){
            listaAnalisis.setResult(Boolean.TRUE);
            Object[] analisisAx = (Object[] ) analisisOb;

            AnalisisDTO analisisDTO = new AnalisisDTO();

            analisisDTO.setLinea((BigDecimal) analisisAx[0]);

            try{ Clob lob = (Clob) analisisAx[1];
                analisisDTO.setTexto(clobToString(lob));}catch (Exception e){}

            analisisDTO.setFecha_creacion((Date) analisisAx[2]);
            analisisDTO.setCreado_por((String) analisisAx[3]);
            analisisDTO.setFecha_modificación((Date) analisisAx[4]);
            analisisDTO.setModificado_por((String) analisisAx[5]);
            analisis.add(analisisDTO);
        }
        listaAnalisis.setList_analisis(analisis);
        return listaAnalisis;
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
            final Reader   reader = data.getCharacterStream();
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
