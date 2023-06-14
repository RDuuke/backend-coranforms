package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.GuardarObligacionItDTO;
import co.gov.coran.licencias.service.GuardarObligacionItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GuardarObligaItController {

    @Autowired
    private GuardarObligacionItService guardarObligacionItService;
    private ArrayList<GuardarObligacionItDTO> obligacionesUpdate = new ArrayList<GuardarObligacionItDTO>();

    private GuardarObligacionItDTO errorOG = new GuardarObligacionItDTO();
    @PostMapping(value ="/guardar_ObligacionIt")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    GuardarObligacionItDTO guardarObigaIt(@RequestBody ArrayList<GuardarObligacionItDTO> Obligaciones){
        
        for (GuardarObligacionItDTO obligacion: Obligaciones){
            this.errorOG = this.guardarObligacionItService.guardarObigaIt(obligacion);
            if ( this.errorOG.getVoError().isEmpty()) {
                this.obligacionesUpdate.add(this.errorOG);
            }
        }

        return this.errorOG;
    }

}
