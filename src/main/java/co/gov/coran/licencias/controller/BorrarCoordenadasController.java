package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarCoordenadasDTO;
import co.gov.coran.licencias.service.BorrarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarCoordenadasController {

    private final BorrarCoordenadasService borrarCoordenadasService;

    @Autowired
    public BorrarCoordenadasController(BorrarCoordenadasService borrarCoordenadasService) {
        this.borrarCoordenadasService = borrarCoordenadasService;
    }

    @DeleteMapping("/eliminar_coordenada")
    @ResponseStatus(HttpStatus.OK)
    public String borrarCoordenada(@RequestBody BorrarCoordenadasDTO borrarCoordenadasDTO) {
        return borrarCoordenadasService.borrarCoordenada(borrarCoordenadasDTO);
    }
}
