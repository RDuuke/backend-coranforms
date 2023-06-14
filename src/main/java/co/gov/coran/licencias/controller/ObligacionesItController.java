package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ObligacionesItListas;
import co.gov.coran.licencias.service.ObligacionesItService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ObligacionesItController {
    public ObligacionesItService obligacionesItService;

    ObligacionesItController(ObligacionesItService obligacionesItService){

        this.obligacionesItService = obligacionesItService;
    }
    @GetMapping("/consulta_obligacionesIt")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ObligacionesItListas obligacionesItListas(@RequestParam(name="niSecEETA") BigDecimal niSecEETA,
                                              @RequestParam(name="niSecTer") String niSecTer){

        return obligacionesItService.obligacionesItListas(niSecEETA,niSecTer);
    }
}
