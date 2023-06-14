package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GeneralConsultaDTO;
import co.gov.coran.licencias.models.dto.ListaGeneralAnte;
import co.gov.coran.licencias.repository.GuardarGeneralAntRepositry;
import co.gov.coran.licencias.service.GeneralConsultaService;
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
public class GeneralConsultaImpl implements GeneralConsultaService {
    @Autowired
    private GuardarGeneralAntRepositry guardarGeneralAntRepositry;

    public GeneralConsultaImpl(GuardarGeneralAntRepositry guardarGeneralAntRepositry) {
        this.guardarGeneralAntRepositry = guardarGeneralAntRepositry;
    }

    @Override
    public ListaGeneralAnte listaGeneralAnte(BigDecimal niSecEEta) {
        ListaGeneralAnte listaGeneralAnte = new ListaGeneralAnte();

        List<Object> objects = GuardarGeneralAntRepositry.listaGeneralAnte(niSecEEta);
        List<GeneralConsultaDTO> general = new ArrayList<>();

        for(Object generalAnt : objects){
            listaGeneralAnte.setResult(Boolean.TRUE);
            Object[] generalAx = (Object[]) generalAnt;

            GeneralConsultaDTO generalConsultaDTO = new GeneralConsultaDTO();

            generalConsultaDTO.setLinea((BigDecimal) generalAx[0]);
            try{ Clob lob = (Clob) generalAx[1];
                generalConsultaDTO.setTexto(clobToString(lob));}catch (Exception e){}

            generalConsultaDTO.setFecha_creacion((Date) generalAx[2]);
            generalConsultaDTO.setCreado_por((String) generalAx[3]);
            generalConsultaDTO.setFecha_modificado((Date) generalAx[4]);
            generalConsultaDTO.setModificado_por((String) generalAx[5]);

            general.add(generalConsultaDTO);

           }
            listaGeneralAnte.setList_Gantecedente(general);
            return listaGeneralAnte;
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
}
