package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.service.ConsultarTiposAgentePeligroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ConsultarTiposAgentePeligroController {

    @Autowired
    ConsultarTiposAgentePeligroService consultarTiposAgentePeligroService;
    ConsultarTiposAgentePeligroController(ConsultarTiposAgentePeligroService consultarTiposAgentePeligroService){
        this.consultarTiposAgentePeligroService = consultarTiposAgentePeligroService;
    }
    @GetMapping("/consultar_tipos_agente_peligro")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<ConsultarTiposAgentePeligroDTO> listaTiposAgentePeligro(@RequestParam(value="categoria") String categoria){
        return consultarTiposAgentePeligroService.listaTiposAgentePeligro(categoria);
    }
}
