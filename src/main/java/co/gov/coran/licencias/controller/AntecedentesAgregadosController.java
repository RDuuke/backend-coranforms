package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.ListaAgregadosAntecedente;
import co.gov.coran.licencias.service.AntecedentesAgregadosService;
import co.gov.coran.licencias.service.AntecedentesConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class AntecedentesAgregadosController {

    @Autowired
    public AntecedentesAgregadosService antecedentesAgregadosService;

    AntecedentesAgregadosController(AntecedentesAgregadosService antecedentesAgregadosService){
        this.antecedentesAgregadosService = antecedentesAgregadosService;
    }

    @GetMapping("/antecedentes_agregados")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    ListaAgregadosAntecedente listaAgregadosAntecedente(
            @RequestParam(name="niSecEETA") BigDecimal niSecEETA){
        return antecedentesAgregadosService.listaAgregadosAntecedente(niSecEETA);

    }


}
