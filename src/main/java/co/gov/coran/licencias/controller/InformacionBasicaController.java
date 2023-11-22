package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.InformacionBasicaDTO;
import co.gov.coran.licencias.service.InformacionBasicaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class InformacionBasicaController {

    private InformacionBasicaService informacionBasicaService;

    public InformacionBasicaController(InformacionBasicaService informacionBasicaService){
        this.informacionBasicaService= informacionBasicaService;
    }

    @GetMapping("/informacionBasica")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    InformacionBasicaDTO listarDatos(
            @RequestParam(name = "niSecEEta") Double niSecEEta,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ) {
        return this.informacionBasicaService.listaDatosBasicos( niSecEEta,  viIdUsuario);
    }
}
