package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaTodoAspect;
import co.gov.coran.licencias.service.TodoAspectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultAspectoController {

    public TodoAspectService todoAspectService;

    public ConsultAspectoController(TodoAspectService todoAspectService) {
        this.todoAspectService = todoAspectService;
    }

    @GetMapping("/consulta_todas_aspect")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaTodoAspect listaTodoAspect(@RequestParam(name="niSecEEta") BigDecimal niSecEEta){

        return todoAspectService.listaTodoAspect(niSecEEta);
    }

}
