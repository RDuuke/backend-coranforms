package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.EditarCoordenadasDTO;
import co.gov.coran.licencias.service.EditarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class EditarCoordenadasController {
    @Autowired
    private EditarCoordenadasService editarCoordenadasService;


    @PostMapping(value ="/editar_coordenada")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    EditarCoordenadasDTO guardarCoord(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "niLinea") String niLinea,
            @RequestParam(value = "viUsuario") String viUsuario,
            @RequestParam(value = "niSecCaptacion") String niSecCaptacion,
            @RequestParam(value = "niSecVertimiento") String niSecVertimiento,
            @RequestParam(value = "niSistemaCoorde") BigDecimal niSistemaCoorde,
            @RequestParam(value = "niX") BigDecimal niX,
            @RequestParam(value = "niY") BigDecimal niY,
            @RequestParam(value = "viTipoCoorde") String viTipoCoorde,
            @RequestParam(value = "viDescripcion") String viDescripcion,
            @RequestParam(value = "viObservaciones") String viObservaciones
    ) {
        EditarCoordenadasDTO editarCoordenadasDTO = new EditarCoordenadasDTO();
        editarCoordenadasDTO.setNiSecEEta(niSecEEta);
        editarCoordenadasDTO.setNiLinea(niLinea);
        editarCoordenadasDTO.setViUsuario(viUsuario);
        editarCoordenadasDTO.setNiSecCaptacion(niSecCaptacion);
        editarCoordenadasDTO.setNiSecVertimiento(niSecVertimiento);
        editarCoordenadasDTO.setNiSistemaCoorde(niSistemaCoorde);
        editarCoordenadasDTO.setNiX(niX);
        editarCoordenadasDTO.setNiY(niY);
        editarCoordenadasDTO.setViTipoCoorde(viTipoCoorde);
        editarCoordenadasDTO.setViDescripcion(viDescripcion);
        editarCoordenadasDTO.setViObservaciones(viObservaciones);

        return this.editarCoordenadasService.guardarCoord(editarCoordenadasDTO);

    }

}
