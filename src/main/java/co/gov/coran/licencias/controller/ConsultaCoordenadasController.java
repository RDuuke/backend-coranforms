package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaCoordenadas;
import co.gov.coran.licencias.service.CoordenadasConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultaCoordenadasController {

    public CoordenadasConsultaService coordenadasConsultaService;

    ConsultaCoordenadasController(CoordenadasConsultaService coordenadasConsultaService){
        this.coordenadasConsultaService = coordenadasConsultaService;
    }

    @GetMapping("/consulta_coordenadas")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaCoordenadas listaCoordenadas(@RequestParam(name="niSecEETA") BigDecimal niSecEETA,
                                      @RequestParam(name="viUsuario") String viUsuario){

        return coordenadasConsultaService.listaCoordenadas(niSecEETA,viUsuario);
    }
}
