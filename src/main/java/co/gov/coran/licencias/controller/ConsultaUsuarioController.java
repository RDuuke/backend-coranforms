package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaUsuariosE;
import co.gov.coran.licencias.service.ConsultaUsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultaUsuarioController {

    ConsultaUsuarioService consultaUsuarioService;
    ConsultaUsuarioController(ConsultaUsuarioService consultaUsuarioService){
        this.consultaUsuarioService = consultaUsuarioService;
    }

    @GetMapping("/consulta_usuario")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaUsuariosE listaUsuariosE(@RequestParam(name="niSecExp") BigDecimal niSecExp){
        return consultaUsuarioService.listaUsuariosE(niSecExp);
    }
}
