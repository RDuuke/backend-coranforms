package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaTodaSituacion;
import co.gov.coran.licencias.models.dto.ListaTodoAspect;
import co.gov.coran.licencias.service.TodaSituacionService;
import co.gov.coran.licencias.service.TodoAspectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class TodaSituacionController {

    public TodaSituacionService todaSituacionService;
    public TodoAspectService todoAspectService;

    public TodaSituacionController(TodaSituacionService todaSituacionService) {
        this.todaSituacionService = todaSituacionService;
    }

    @GetMapping("/consulta_todas_situacionE")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaTodaSituacion listaTodaSituacion(@RequestParam(name="niSecEEta") BigDecimal niSecEEta){

        return todaSituacionService.listaTodaSituacion(niSecEEta);
    }



}
