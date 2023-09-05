package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ConsultarTiposAgentePeligroDTO;
import co.gov.coran.licencias.service.ConsultaAfectacionAmbientalService;
import co.gov.coran.licencias.service.ConsultarTiposAgentePeligroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ConsultaAfectacionAmbientalController {

    @Autowired
    ConsultaAfectacionAmbientalService consultaAfectacionAmbientalService;
    ConsultaAfectacionAmbientalController(ConsultaAfectacionAmbientalService consultaAfectacionAmbientalService){
        this.consultaAfectacionAmbientalService = consultaAfectacionAmbientalService;
    }
    @GetMapping("/consulta_afectacion_ambiental")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<ConsultarTiposAgentePeligroDTO> listaAfectacionesAmbientales(
            @RequestParam(value="niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value="niLinea") BigDecimal niLinea
    ){
        System.out.println("Hola desde controller");
        return this.consultaAfectacionAmbientalService.listaAfectacionesAmbientales(niSecEEta, niLinea);
    }
}
