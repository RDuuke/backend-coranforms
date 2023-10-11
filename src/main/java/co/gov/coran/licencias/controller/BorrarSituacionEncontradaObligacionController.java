package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarSituacionEncontradaObligacionDTO;
import co.gov.coran.licencias.repository.BorrarSituacionEncontradaObligacionRepository;
import co.gov.coran.licencias.service.BorrarSituacionEncontradaObligacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarSituacionEncontradaObligacionController {

    @Autowired
    private BorrarSituacionEncontradaObligacionService borrarSituacionEncontradaObligacionService;

    @PostMapping("/borrar_situacion_obligacion")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarSituacionEncontradaObligacion(@RequestBody BorrarSituacionEncontradaObligacionDTO borrarSituacionEncontradaObligacionDTO){
        return this.borrarSituacionEncontradaObligacionService.borrarSituacionEncontrada(borrarSituacionEncontradaObligacionDTO);
    }
}
