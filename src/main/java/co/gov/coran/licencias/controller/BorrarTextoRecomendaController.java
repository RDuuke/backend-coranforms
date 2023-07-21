package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarTextoRecomendaDTO;
import co.gov.coran.licencias.service.BorrarTextoRecomendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarTextoRecomendaController {
    @Autowired
    private BorrarTextoRecomendaService borrarTextoRecomendaService;

    @PostMapping("/borrar_texto_recomenda")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarTextoRecomenda(@RequestBody BorrarTextoRecomendaDTO borrarTextoRecomendaDTO){
        return this.borrarTextoRecomendaService.borrarTextoRecomenda(borrarTextoRecomendaDTO);
    }
}
