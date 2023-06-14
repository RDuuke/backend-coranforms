package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaGeneralAnte;
import co.gov.coran.licencias.repository.GuardarGeneralAntRepositry;
import co.gov.coran.licencias.service.GeneralConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class GeneralConsultaController {
    public GeneralConsultaService generalConsultaService;

    public GeneralConsultaController(GeneralConsultaService generalConsultaService) {
        this.generalConsultaService = generalConsultaService;
    }


    @GetMapping("/consulta_general")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
     ListaGeneralAnte listaGeneralAnte(@RequestParam(name="niSecEEta") BigDecimal niSecEEta){

        return generalConsultaService.listaGeneralAnte(niSecEEta);
    }

}
