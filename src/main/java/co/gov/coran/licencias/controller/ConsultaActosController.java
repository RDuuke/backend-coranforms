package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListasActos;
import co.gov.coran.licencias.service.ConsultaActosServicios;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultaActosController {
    ConsultaActosServicios consultaActosServicios;
    ConsultaActosController(ConsultaActosServicios consultaActosServicios){
        this.consultaActosServicios = consultaActosServicios;
    }
    @GetMapping("/actos_expediente")
    @ResponseStatus(HttpStatus.OK)
   public @ResponseBody
    ListasActos listasActos(@RequestParam(value="niSecExp")BigDecimal niSecExp){
        return consultaActosServicios.listaActos(niSecExp);
    }
}
