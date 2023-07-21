package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.service.BorrarAntecedenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarAntecedenteGnralController {

    @Autowired
    private BorrarAntecedenteService borrarAntecedenteService;

    @PostMapping("/borrar_antecedente_gnral")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarAntecedenteGnral(@RequestBody BorrarAntecedenteDTO borrarAntecedenteDTO){
        return this.borrarAntecedenteService.borrarAntecedente(borrarAntecedenteDTO);
    }

}
