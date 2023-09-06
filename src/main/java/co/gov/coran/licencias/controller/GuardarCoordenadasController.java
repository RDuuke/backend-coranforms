package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;
import co.gov.coran.licencias.service.GuardarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class GuardarCoordenadasController {
    @Autowired
    private GuardarCoordenadasService guardarCoordenadasService;


    @PostMapping(value ="/guardar_coordenadas")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> guardarCoord(@RequestBody List<GuardarCoordenadasDTO> guardarCoordenadasDTOList){
        return ResponseEntity.ok("Cordenadas guardadas exitosamente");
    }

}
