package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaExpedientes;
import co.gov.coran.licencias.service.ExpedienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExpedientesController {


    private ExpedienteService expedienteService;

    public ExpedientesController(ExpedienteService expedienteService) {

        this.expedienteService = expedienteService;
    }
    @PostMapping("/lista-expedientes")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaExpedientes listaExpedientes(@RequestParam(name = "sequenceThirdParty") Integer sequenceThirdParty) {
        return this.expedienteService.listarExpedientes(sequenceThirdParty);
    }

}