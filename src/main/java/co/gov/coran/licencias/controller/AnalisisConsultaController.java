package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaAnalisis;
import co.gov.coran.licencias.models.dto.ListaFirmantes;
import co.gov.coran.licencias.service.AnalisisConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class AnalisisConsultaController {

    public AnalisisConsultaService analisisConsultaService;

    AnalisisConsultaController(AnalisisConsultaService analisisConsultaService){
        this.analisisConsultaService= analisisConsultaService;
    }
    @GetMapping("/analisis_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    ListaAnalisis listaAnalisis(@RequestParam(name="niSecEETA") BigDecimal niSecEETA){
        return analisisConsultaService.listaAnalisis( niSecEETA);
    }
}
