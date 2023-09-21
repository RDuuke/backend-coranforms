package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ProblematicaBorrarDTO;
import co.gov.coran.licencias.service.ProblematicaBorrarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProblematicaBorrarController {
    @Autowired
    private ProblematicaBorrarService problematicaBorrarService;
    @DeleteMapping("/borrar_afectacion_amb")
    @ResponseStatus(HttpStatus.OK)
    public String borraAfectacionAmbiente(@RequestBody ProblematicaBorrarDTO problematicaBorrarDTO){
        return problematicaBorrarService.borraAfectacionAmbiente(problematicaBorrarDTO);
    }
}
