package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AnalisisDTO;
import co.gov.coran.licencias.models.dto.Conclusion;
import co.gov.coran.licencias.models.dto.Recomienda;
import co.gov.coran.licencias.models.dto.RecomiendaConsultaDTO;
import co.gov.coran.licencias.repository.ConsultaRecomendacionRepository;
import co.gov.coran.licencias.repository.TextoGuardarRepository;
import co.gov.coran.licencias.service.RecomendacionConsultaService;
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
public class RecomendacionConsultaImpl implements RecomendacionConsultaService {
    @Autowired
    private ConsultaRecomendacionRepository consultaRecomendacionRepository;

    public RecomendacionConsultaImpl(ConsultaRecomendacionRepository consultaRecomendacionRepository){
        this.consultaRecomendacionRepository = consultaRecomendacionRepository;
    }

    @Override
    public Recomienda recomienda(BigDecimal niSecEEta) {
        Recomienda recomienda = new Recomienda();

        List<Object> objects = ConsultaRecomendacionRepository.recomienda(niSecEEta);
        List<RecomiendaConsultaDTO> recomendaciones = new ArrayList<>();
        for( Object recomiendaOb : objects){
            recomienda.setResult(Boolean.TRUE);
            Object[] recomiendaAx = (Object[] ) recomiendaOb;

            RecomiendaConsultaDTO recomiendaConsultaDTO = new RecomiendaConsultaDTO();

            recomiendaConsultaDTO.setLinea((BigDecimal) recomiendaAx[0]);
            try{
                Clob lob = (Clob) recomiendaAx[1];
                recomiendaConsultaDTO.setTexto(clobToString(lob));
            }catch (Exception e){}

            recomiendaConsultaDTO.setFecha_creacion((Date) recomiendaAx[2]);
            recomiendaConsultaDTO.setCreado_por((String) recomiendaAx[3]);
            recomiendaConsultaDTO.setFecha_modificacion((Date) recomiendaAx[4]);
            recomiendaConsultaDTO.setModificado_por((String) recomiendaAx[5]);

            recomendaciones.add(recomiendaConsultaDTO);
                }
                recomienda.setRecomienda(recomendaciones);
                return recomienda;
            }
            private static byte[] serialize(Object object) throws IOException {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(object);
                oos.close();
                return baos.toByteArray();
            }
            private String clobToString(Clob data)
            {
                final StringBuilder sb = new StringBuilder();

                try
                {
                    final Reader reader = data.getCharacterStream();
                    final BufferedReader br     = new BufferedReader(reader);

                    int b;
                    while(-1 != (b = br.read()))
                    {
                        sb.append((char)b);
                    }

                    br.close();
                }
                catch (SQLException e)
                {
                    System.out.print("SQL. Could not convert CLOB to string");
                    return e.toString();
                }
                catch (IOException e)
                {
                    System.out.print("IO. Could not convert CLOB to string");
                    return e.toString();
                }

                return sb.toString();
            }


    @Override
    public Conclusion conclusion(BigDecimal niSecEEta) {
        Conclusion conclusion = new Conclusion();

        List<Object> objects = ConsultaRecomendacionRepository.conclusion(niSecEEta);
        List<RecomiendaConsultaDTO> conclusiones = new ArrayList<>();
        for( Object conclusionesOb : objects){
            conclusion.setResult(Boolean.TRUE);
            Object[] conclusionAx = (Object[] ) conclusionesOb;

            RecomiendaConsultaDTO recomiendaConsultaDTO = new RecomiendaConsultaDTO();

            recomiendaConsultaDTO.setLinea((BigDecimal) conclusionAx[0]);
            try{
                Clob lob = (Clob) conclusionAx[1];
                recomiendaConsultaDTO.setTexto(clobToString(lob));
            }catch (Exception e){}

            recomiendaConsultaDTO.setFecha_creacion((Date) conclusionAx[2]);
            recomiendaConsultaDTO.setCreado_por((String) conclusionAx[3]);
            recomiendaConsultaDTO.setFecha_modificacion((Date) conclusionAx[4]);
            recomiendaConsultaDTO.setModificado_por((String) conclusionAx[5]);

            conclusiones.add(recomiendaConsultaDTO);
        }
        conclusion.setConclusion_texto(conclusiones);
        return conclusion;
    }
    }

