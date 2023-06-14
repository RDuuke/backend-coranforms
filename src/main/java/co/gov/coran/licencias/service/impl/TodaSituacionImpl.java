package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ListaTodaSituacion;
import co.gov.coran.licencias.models.dto.ListaTodoAspect;
import co.gov.coran.licencias.models.dto.TodaSituacionDTO;
import co.gov.coran.licencias.models.dto.TodosAspectDTO;
import co.gov.coran.licencias.repository.TodasSituacionRepository;
import co.gov.coran.licencias.service.TodaSituacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodaSituacionImpl implements TodaSituacionService {

    @Autowired
    private TodasSituacionRepository todasSituacionRepository;

    public TodaSituacionImpl(TodasSituacionRepository todasSituacionRepository) {
        this.todasSituacionRepository = todasSituacionRepository;
    }

    @Override
    public ListaTodaSituacion listaTodaSituacion(BigDecimal niSecEEta) {
        ListaTodaSituacion listaTodaSituacion = new ListaTodaSituacion();
        List<Object> objects = TodasSituacionRepository.listaTodaSituacion( niSecEEta);
        List<TodaSituacionDTO> toda_situ  = new ArrayList<>();

        for(Object situ:objects){

            listaTodaSituacion.setResult(Boolean.TRUE);
            Object[] situAux= (Object[]) situ;

            TodaSituacionDTO todaSituacionDTO = new TodaSituacionDTO();

            todaSituacionDTO.setLinea((BigDecimal) situAux[0]);
            todaSituacionDTO.setExpobl_exp_sec((BigDecimal) situAux[1]);
            todaSituacionDTO.setExpobl_linea((BigDecimal) situAux[2]);
            try{
                Clob lob = (Clob) situAux[3];
                todaSituacionDTO.setTexto(clobToString(lob));
                Clob lobIm = (Clob) situAux[4];
                todaSituacionDTO.setImagenes(clobToString(lobIm));
            }catch (Exception e){}

            todaSituacionDTO.setTipo((String) situAux[5]);
            todaSituacionDTO.setSISTEMA_COORDENADAS((BigDecimal) situAux[6]);
            todaSituacionDTO.setX((BigDecimal)  situAux[7]);
            todaSituacionDTO.setY((BigDecimal) situAux[8]);
            todaSituacionDTO.setTitulo((String) situAux[9]);
            todaSituacionDTO.setCota((BigDecimal) situAux[10]);
            todaSituacionDTO.setFECHA_CREACION((Date) situAux[11]);
            todaSituacionDTO.setCREADO_POR((String) situAux[12]);

            toda_situ.add(todaSituacionDTO);
        }

        listaTodaSituacion.setLista_todaSituacion(toda_situ);
        return listaTodaSituacion;
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

