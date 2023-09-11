package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.models.dto.BorrarAntecedenteGenralDTO;
import co.gov.coran.licencias.service.BorrarAntecedenteGnralService;
import co.gov.coran.licencias.service.BorrarAntecedenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarAntecedenteGnralController {

    @Autowired
    private BorrarAntecedenteGnralService borrarAntecedenteGnralService;

    @PostMapping("/borrar_antecedente_gnral")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarAntecedenteGnral(@RequestBody BorrarAntecedenteGenralDTO borrarAntecedenteGenralDTO){
        return this.borrarAntecedenteGnralService.borrarAntecedenteGnral(borrarAntecedenteGenralDTO);
    }

}
