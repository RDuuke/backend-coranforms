package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;
import co.gov.coran.licencias.service.ProblematicaConsultaByLineaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ProblematicaConsultaByLineaController {

    public ProblematicaConsultaByLineaService problematicaConsultaByLineaService;

    public ProblematicaConsultaByLineaController (ProblematicaConsultaByLineaService problematicaConsultaByLineaService){
        this.problematicaConsultaByLineaService = problematicaConsultaByLineaService;

    }
    @GetMapping("problematica_consulta_item")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ProblematicaGuardarDTO problematicaItem(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "niLinea") BigDecimal niLinea
            ){
        return this.problematicaConsultaByLineaService.problematicaItem(niSecEEta, niLinea);
    }

}
