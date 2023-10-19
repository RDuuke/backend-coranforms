package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ConsultarTiposCoordenadasDTO;
import co.gov.coran.licencias.service.ConsultarTiposCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
@RestController
public class ConsultarTiposCoordenadasController {
    @Autowired
    private ConsultarTiposCoordenadasService consultarTiposCoordenadasService;
    @GetMapping(value = "/consultar_tipos_coordenadas")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List<ConsultarTiposCoordenadasDTO> consultarTiposCoordenadas(@RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
                                                                 @RequestParam(name = "viUsuario") String viUsuario){
        return this.consultarTiposCoordenadasService.consultarTiposCoordenadas(niSecEEta, viUsuario);
    }
}
