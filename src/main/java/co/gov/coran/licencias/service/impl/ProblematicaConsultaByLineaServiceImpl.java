package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;
import co.gov.coran.licencias.repository.ProblematicaConsultaByLineaRepository;
import co.gov.coran.licencias.service.ProblematicaConsultaByLineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.List;

@Service
public class ProblematicaConsultaByLineaServiceImpl implements ProblematicaConsultaByLineaService {

    @Autowired
    public ProblematicaConsultaByLineaRepository problematicaConsultaByLineaRepository;

    public ProblematicaConsultaByLineaServiceImpl(ProblematicaConsultaByLineaRepository problematicaConsultaByLineaRepository){
        this.problematicaConsultaByLineaRepository = problematicaConsultaByLineaRepository;
    }
    @Override
    public ProblematicaGuardarDTO problematicaItem(BigDecimal niSecEEta, BigDecimal niLinea) {
        ProblematicaGuardarDTO problematicaItem = new ProblematicaGuardarDTO();
        List<Object> objects = this.problematicaConsultaByLineaRepository.problematicaConsultaItem(niSecEEta, niLinea);
        for (Object problemaOb : objects) {
            Object[] problemAux = (Object[]) problemaOb;

            problematicaItem.setNioLinea(problemAux[1].toString());
            problematicaItem.setNiSecEEta(new BigDecimal(problemAux[0].toString()));
            problematicaItem.setViTipo((String) problemAux[2]);
            problematicaItem.setNiIntensidad((BigDecimal) problemAux[3]);
            problematicaItem.setNiExtension((BigDecimal) problemAux[4]);
            problematicaItem.setNiPersistencia((BigDecimal) problemAux[5]);
            problematicaItem.setNiReversibilidad((BigDecimal) problemAux[6]);
            problematicaItem.setNiRecuperabilidad((BigDecimal) problemAux[7]);
            problematicaItem.setNiProbabilidadOcurrencia((BigDecimal) problemAux[8]);
            try{ Clob lob = (Clob) problemAux[10];
                problematicaItem.setJustificacion_gnral(clobToString(lob));}catch (Exception e){}

            try{ Clob lob = (Clob) problemAux[9];
                problematicaItem.setJustificacion_riesgo(clobToString(lob));}catch (Exception e){}

            try{ Clob lob = (Clob) problemAux[11];
                problematicaItem.setJustificacion_importancia(clobToString(lob));}catch (Exception e){}

            try{ Clob lob = (Clob) problemAux[12];
                problematicaItem.setJustificacion_agente(clobToString(lob));}catch (Exception e){}

            problematicaItem.setViUsuario((String) problemAux[14]);
        }
        return  problematicaItem;
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
