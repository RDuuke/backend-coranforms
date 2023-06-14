package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ProblematicaLista;
import co.gov.coran.licencias.service.ProblamaConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ProblematicaConsultaController {
    public ProblamaConsultaService problamaConsultaService;

    public ProblematicaConsultaController(ProblamaConsultaService problamaConsultaService) {
        this.problamaConsultaService = problamaConsultaService;
    }

      @GetMapping("/problematica_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
      ProblematicaLista problematicaLista(@RequestParam(name="niSecEEta") BigDecimal niSecEEta){
        return problamaConsultaService.problematicaList( niSecEEta);
    }

}
