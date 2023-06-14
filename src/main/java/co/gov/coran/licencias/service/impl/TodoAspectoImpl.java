package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ListaTodoAspect;
import co.gov.coran.licencias.models.dto.TodosAspectDTO;
import co.gov.coran.licencias.repository.TodasSituacionRepository;
import co.gov.coran.licencias.service.TodoAspectService;
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
public class TodoAspectoImpl implements TodoAspectService {

    @Autowired
    private TodasSituacionRepository todasSituacionRepository;

    public TodoAspectoImpl(TodasSituacionRepository todasSituacionRepository) {
        this.todasSituacionRepository = todasSituacionRepository;
    }

    @Override
    public ListaTodoAspect listaTodoAspect(BigDecimal niSecEEta) {

        ListaTodoAspect listaTodoAspect = new ListaTodoAspect();
        List<Object> objects = TodasSituacionRepository.listaTodoAspect(niSecEEta);
        List<TodosAspectDTO> todosAspec = new ArrayList<>();

        for( Object aspect : objects){
            listaTodoAspect.setResult(Boolean.TRUE);
            Object[] aspectAx = (Object[] ) aspect;

            TodosAspectDTO todosAspectDTO = new TodosAspectDTO();

            todosAspectDTO.setLinea((BigDecimal) aspectAx[0]);
            try{
                Clob lob = (Clob) aspectAx[1];
                todosAspectDTO.setTexto(clobToString(lob));
                Clob lobIm = (Clob) aspectAx[2];
                todosAspectDTO.setImagenes(clobToString(lobIm));
            }catch (Exception e){}
            todosAspectDTO.setTitulo((String) aspectAx[3]);
            todosAspectDTO.setTipo((String) aspectAx[4]);
            todosAspectDTO.setSistema_coordenadas((BigDecimal) aspectAx[5]);
            todosAspectDTO.setX((BigDecimal) aspectAx[6]);
            todosAspectDTO.setY((BigDecimal) aspectAx[7]);
            todosAspectDTO.setCota((BigDecimal) aspectAx[8]);
            todosAspectDTO.setFecha_creacion((Date) aspectAx[9]);
            todosAspectDTO.setCreado_por((String) aspectAx[10]);
            todosAspectDTO.setFecha_modificado((Date) aspectAx[11]);
            todosAspectDTO.setModificado_por((String) aspectAx[12]);

            todosAspec.add(todosAspectDTO);

        }
        listaTodoAspect.setLista_todoAspect(todosAspec);
        return listaTodoAspect;


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
