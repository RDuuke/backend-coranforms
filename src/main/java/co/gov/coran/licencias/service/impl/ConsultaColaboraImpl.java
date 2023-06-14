package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ColaboracionDTO;
import co.gov.coran.licencias.models.dto.ListaColabora;
import co.gov.coran.licencias.repository.ConsultaColaboradoresRepository;
import co.gov.coran.licencias.service.ConsultaColaboradoresService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ConsultaColaboraImpl implements ConsultaColaboradoresService {

    ConsultaColaboradoresRepository consultaColaboradoresRepository;

    public ConsultaColaboraImpl(ConsultaColaboradoresRepository consultaColaboradoresRepository) {
        this.consultaColaboradoresRepository = consultaColaboradoresRepository;
    }

    @Override
    public ListaColabora listaColabora(BigDecimal niSecEEta, String viIdUsuario) {
     ListaColabora listaColabora = new ListaColabora();
        List<Object> objects = ConsultaColaboradoresRepository.listaColabora(niSecEEta,viIdUsuario);
        List<ColaboracionDTO> Colaboradores = new ArrayList<>();

        for(Object Colaborador: objects){
            listaColabora.setResult(Boolean.TRUE);
            Object[] colaboraAux = (Object[]) Colaborador;

            ColaboracionDTO colaboracionDTO = new ColaboracionDTO();

            colaboracionDTO.setNombre_asignado((String) colaboraAux[0]);
            colaboracionDTO.setUsuario_asignado((String) colaboraAux[1]);
            colaboracionDTO.setAsignado_por((String) colaboraAux[2]);
            colaboracionDTO.setFecha_asignacion((Date) colaboraAux[3]);

            Colaboradores.add(colaboracionDTO);

        }

        listaColabora.setList_colaboradores(Colaboradores);
        return listaColabora;
    }
}
