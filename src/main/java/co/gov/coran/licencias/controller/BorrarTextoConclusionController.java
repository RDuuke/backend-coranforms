package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarTextoConclusionDTO;
import co.gov.coran.licencias.service.BorrarTextoConclusionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarTextoConclusionController {

    @Autowired
    private BorrarTextoConclusionService borrarTextoConclusionService;

    @PostMapping("/borrar_texto_conclusion")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarTextoConclusion(@RequestBody BorrarTextoConclusionDTO borrarTextoConclusionDTO){
        return this.borrarTextoConclusionService.borrarTextoConclusion(borrarTextoConclusionDTO);
    }



}
