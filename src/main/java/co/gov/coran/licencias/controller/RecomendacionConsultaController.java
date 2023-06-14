package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.Conclusion;
import co.gov.coran.licencias.models.dto.ListaAnalisis;
import co.gov.coran.licencias.models.dto.Recomienda;
import co.gov.coran.licencias.service.RecomendacionConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class RecomendacionConsultaController {
    public RecomendacionConsultaService recomendacionConsultaService;

    RecomendacionConsultaController(RecomendacionConsultaService recomendacionConsultaService){
        this.recomendacionConsultaService = recomendacionConsultaService;
    }
    @GetMapping("/recomendacion_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    Recomienda recomienda(@RequestParam(name="niSecEETA") BigDecimal niSecEETA) {
        return recomendacionConsultaService.recomienda( niSecEETA);
    }

    @GetMapping("/conclusion_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    Conclusion conclusion(@RequestParam(name="niSecEETA") BigDecimal niSecEETA) {
        return recomendacionConsultaService.conclusion( niSecEETA);
    }
}
