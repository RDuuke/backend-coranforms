package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.ListaUsuariosE;

import java.math.BigDecimal;

public interface ConsultaUsuarioService {
    ListaUsuariosE listaUsuariosE(BigDecimal niSecExp);
}
