package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ConsultaUsuarioDTO;
import co.gov.coran.licencias.models.dto.ListaUsuariosE;
import co.gov.coran.licencias.repository.ConsultarUsuarios_ExpedienteRepository;
import co.gov.coran.licencias.service.ConsultaUsuarioService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultaUsuarioImpl implements ConsultaUsuarioService {
    private ConsultarUsuarios_ExpedienteRepository consultarUsuarios_expedienteRepository;
    public ConsultaUsuarioImpl(ConsultarUsuarios_ExpedienteRepository consultarUsuarios_expedienteRepository){
        this.consultarUsuarios_expedienteRepository  = consultarUsuarios_expedienteRepository;
    }

    @Override
    public ListaUsuariosE listaUsuariosE(BigDecimal niSecExp) {
        ListaUsuariosE listaUsuariosE = new ListaUsuariosE();
        List<Object> objects = consultarUsuarios_expedienteRepository.listaUsuariosE(niSecExp);
        List<ConsultaUsuarioDTO> usuariosE = new ArrayList<>();

        for( Object usuario : objects){
            listaUsuariosE.setResult(Boolean.TRUE);
            Object[] usuarioEx =(Object[]) usuario;

            ConsultaUsuarioDTO consultaUsuarioDTO = new ConsultaUsuarioDTO();

            consultaUsuarioDTO.setSec((BigDecimal) usuarioEx[0]);
            consultaUsuarioDTO.setDocumento((String) usuarioEx[1]);
            consultaUsuarioDTO.setNombres((String) usuarioEx[2]);

            usuariosE.add(consultaUsuarioDTO);
        }
        listaUsuariosE.setLista_usuario(usuariosE);
        return listaUsuariosE;
    }
}
