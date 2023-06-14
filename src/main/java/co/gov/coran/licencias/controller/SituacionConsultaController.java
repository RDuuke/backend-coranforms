package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.SituacionLista;
import co.gov.coran.licencias.service.SituacionConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class SituacionConsultaController {

    public SituacionConsultaService situacionConsultaService;

    public SituacionConsultaController(SituacionConsultaService situacionConsultaService) {
        this.situacionConsultaService = situacionConsultaService;
    }

     @GetMapping("/situacion_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
     SituacionLista situacionLista(@RequestParam(name="niSecEEta") BigDecimal niSecEEta,
                                   @RequestParam(name="niLineaObliga") Integer niLineaObliga
    ) throws SQLException, IOException {
        return situacionConsultaService.situacionLista(niSecEEta, niLineaObliga);
    }
}
