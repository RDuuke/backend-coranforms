package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarNuevoAgentePeligroDTO;
import co.gov.coran.licencias.service.GuardarNuevoAgentePeligroService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;


import java.io.IOException;
import java.sql.SQLException;

@RestController
public class GuardarNuevoAgentePeligroController {

    @Autowired
    private GuardarNuevoAgentePeligroService guardarNuevoAgentePeligroService;

    @PostMapping(value="/guardar_nuevo_agente_peligro")
    @ResponseStatus(HttpStatus.OK)

    public @ResponseBody  GuardarNuevoAgentePeligroDTO guardarNuevoAgentePeligro(
            @RequestParam(value = "viNombre") String viNombre,
            @RequestParam(value = "viCategoria") String viCategoria,
            @RequestParam(value = "viUsuario") String viUsuario
    ) throws IOException, SQLException {

        GuardarNuevoAgentePeligroDTO nuevoAgentePeligro =new GuardarNuevoAgentePeligroDTO();

        nuevoAgentePeligro.setViNombre(viNombre);
        nuevoAgentePeligro.setViCategoria(viCategoria);
        nuevoAgentePeligro.setViUsuario(viUsuario);

        return this.guardarNuevoAgentePeligroService.guardarNuevoAgentePeligro(nuevoAgentePeligro);

    }

}
