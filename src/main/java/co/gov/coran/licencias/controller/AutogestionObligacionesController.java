package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.ListaObligaciones;
import co.gov.coran.licencias.service.ConsultaObligacionesAutogestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class AutogestionObligacionesController {


    public ConsultaObligacionesAutogestion consultaObligacionesAutogestion;


    AutogestionObligacionesController(ConsultaObligacionesAutogestion consultaObligacionesAutogestion){
        this.consultaObligacionesAutogestion = consultaObligacionesAutogestion;
    }

    @GetMapping("/autogestion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaObligaciones listaObligaciones(@RequestParam(name="niSecEETa") BigDecimal niSecEETa){
        return consultaObligacionesAutogestion.listaObligaciones(niSecEETa);
    }
}
