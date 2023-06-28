package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ProblemaConsultaDTO;
import co.gov.coran.licencias.models.dto.ProblematicaLista;
import co.gov.coran.licencias.repository.ProblematicaConsultaRepository;
import co.gov.coran.licencias.service.ProblamaConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProblematicaConsultaImpl implements ProblamaConsultaService {
    @Autowired
    private ProblematicaConsultaRepository problematicaConsultaRepository;

    public ProblematicaConsultaImpl(ProblematicaConsultaRepository problematicaConsultaRepository) {
        this.problematicaConsultaRepository = problematicaConsultaRepository;
    }

    @Override
    public ProblematicaLista problematicaList(BigDecimal niSecEEta) {
        ProblematicaLista problematicaLista = new ProblematicaLista();
        List<Object>objects = ProblematicaConsultaRepository.problematicaList(niSecEEta);
        List<ProblemaConsultaDTO> problematicas = new ArrayList<>();

        for(Object problemaOb : objects){
            problematicaLista.setResult(Boolean.TRUE);
            Object[] problemAux = (Object[]) problemaOb;

            ProblemaConsultaDTO problemaConsultaDTO = new ProblemaConsultaDTO();

            problemaConsultaDTO.setLinea((BigDecimal) problemAux[0]);
            problemaConsultaDTO.setEeta_sec((BigDecimal) problemAux[1]);
            problemaConsultaDTO.setTipo((String) problemAux[2]);
            problemaConsultaDTO.setTipo_txt((String) problemAux[3]);
            problemaConsultaDTO.setIntensidad((BigDecimal) problemAux[4]);
            problemaConsultaDTO.setIntensidad_txt((String) problemAux[5]);
            problemaConsultaDTO.setExtension((BigDecimal) problemAux[6]);
            problemaConsultaDTO.setExtension_txt((String) problemAux[7]);
            problemaConsultaDTO.setPersistencia((BigDecimal) problemAux[8]);
            problemaConsultaDTO.setPersistencia_txt((String) problemAux[9]);
            problemaConsultaDTO.setReversibilidad((BigDecimal) problemAux[10]);
            problemaConsultaDTO.setReversibilidad_txt((String) problemAux[11]);
            problemaConsultaDTO.setRecuperabilidad((BigDecimal) problemAux[12]);
            problemaConsultaDTO.setRecuperabilidad_txt((String) problemAux[13]);
            problemaConsultaDTO.setProbabilidad_ocurrencia((BigDecimal) problemAux[14]);
            problemaConsultaDTO.setProbabilidad_ocurrencia_txt((String) problemAux[15]);
            problemaConsultaDTO.setImportancia_afectacion((BigDecimal) problemAux[16]);
            problemaConsultaDTO.setMagnitud_potencial((BigDecimal) problemAux[17]);
            problemaConsultaDTO.setMagnitud_potencial_txt((String) problemAux[18]);
            problemaConsultaDTO.setValor_riesgo((BigDecimal) problemAux[19]);

            try{ Clob lob = (Clob) problemAux[20];
            problemaConsultaDTO.setJustificacion_importancia(clobToString(lob));}catch (Exception e){}

            try{ Clob lob = (Clob) problemAux[21];
                problemaConsultaDTO.setJustificacion_riesgo(clobToString(lob));}catch (Exception e){}

            try{ Clob lob = (Clob) problemAux[22];
                problemaConsultaDTO.setJustificacion_gnral(clobToString(lob));}catch (Exception e){}

            problemaConsultaDTO.setFecha_creacion((Date) problemAux[23]);
            problemaConsultaDTO.setCreado_por((String) problemAux[24]);

            problematicas.add(problemaConsultaDTO);
        }
        problematicaLista.setLista_problema(problematicas);

        return problematicaLista;
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
