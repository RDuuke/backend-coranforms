package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.ListaAntecedente;
import co.gov.coran.licencias.service.AntecedentesConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultaAntecedenteController {


    public AntecedentesConsultaService antecedentesConsultaService;

    ConsultaAntecedenteController(AntecedentesConsultaService antecedentesConsultaService){
        this.antecedentesConsultaService = antecedentesConsultaService;
    }

    @GetMapping("/antecedentes-expediente")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaAntecedente listaAntecedente(@RequestParam(name="niSecEETA") BigDecimal niSecEETA){
        return  antecedentesConsultaService.listaAntecedente(niSecEETA);
    }

}
