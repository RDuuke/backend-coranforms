package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.service.BorrarAntecedenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarAntecedenteController {
    @Autowired
    private BorrarAntecedenteService borrarAntecedenteService;
    @PostMapping("/Borrar_antecedente")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarAntecedente(@RequestBody BorrarAntecedenteDTO borrarAntecedenteDTO){
        return this.borrarAntecedenteService.borrarAntecedente(borrarAntecedenteDTO);
    }
}
