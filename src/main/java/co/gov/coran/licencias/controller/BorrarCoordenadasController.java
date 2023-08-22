package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarCoordenadasDTO;
import co.gov.coran.licencias.repository.BorrarCoordenadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarCoordenadasController {
    @Autowired
    private BorrarCoordenadasRepository borrarCoordenadasService;

    @PostMapping("/borrar_coordenadas")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarCoordenada(@RequestBody BorrarCoordenadasDTO borrarCoordenadasDTO) {
        return borrarCoordenadasService.borrarCoordenada(borrarCoordenadasDTO);
    }
}
