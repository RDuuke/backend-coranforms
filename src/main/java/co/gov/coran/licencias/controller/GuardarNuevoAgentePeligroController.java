package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarNuevoAgentePeligroDTO;
import co.gov.coran.licencias.service.GuardarNuevoAgentePeligroService;

import java.io.IOException;
import java.sql.SQLException;

@RestController
public class GuardarNuevoAgentePeligroController {

    @Autowired
    private GuardarNuevoAgentePeligroService guardarNuevoAgentePeligroService;

    @PostMapping(value="/guardar_nuevo_agente_peligro");
    @ResponseStatus(HttpStatus.OK);

    GuardarNuevoAgentePeligroDTO guardarNuevoAgentePeligro(
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
