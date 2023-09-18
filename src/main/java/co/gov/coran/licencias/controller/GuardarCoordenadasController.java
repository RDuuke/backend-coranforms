package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;
import co.gov.coran.licencias.service.GuardarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuardarCoordenadasController {
    private final GuardarCoordenadasService guardarCoordenadasService;

    public GuardarCoordenadasController(GuardarCoordenadasService guardarCoordenadasService) {
        this.guardarCoordenadasService = guardarCoordenadasService;
    }

    @PostMapping(value ="/guardar_coordenadas")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<GuardarCoordenadasDTO>> guardarCoordenadas(@RequestBody List<GuardarCoordenadasDTO> guardarCoordenadasDTOList){
        List<GuardarCoordenadasDTO> nuevasCoordenadas = guardarCoordenadasService.guardarCoordenadas(guardarCoordenadasDTOList);
        return new ResponseEntity<>(nuevasCoordenadas, HttpStatus.CREATED);

    }

}
