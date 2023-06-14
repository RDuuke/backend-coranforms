package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.SituacionEncontradaDTO;
import co.gov.coran.licencias.service.SituacionEncontradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class SituacionGuardarController {
    @Autowired
    private SituacionEncontradaService situacionEncontradaService;

    @PostMapping(value="/guardar_situacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    SituacionEncontradaDTO guardarSituacionE(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") Integer nioLinea,
            @RequestParam(value = "viTipo") String viTipo,
            @RequestParam(value = "niLineaObliga") String niLineaObliga,
            @RequestParam(value = "viTitulo") String viTitulo,
            @RequestParam(value = "niSistemaCoordenadas") BigDecimal niSistemaCoordenadas,
            @RequestParam(value = "niX") BigDecimal niX,
            @RequestParam(value = "niY") BigDecimal niY,
            @RequestParam(value = "niCota") BigDecimal niCota,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestParam(value = "ciImagenes") String ciImagenes,
            @RequestParam(value = "viIdUsuario") String viIdUsuario

    ) throws IOException, SQLException {
        SituacionEncontradaDTO situacionEncontradaDTO = new SituacionEncontradaDTO();
        try {
            situacionEncontradaDTO.setNiSecEEta(niSecEEta);
            situacionEncontradaDTO.setNioLinea(nioLinea);
            situacionEncontradaDTO.setViTipo(viTipo);
            situacionEncontradaDTO.setNiLineaObliga(niLineaObliga);
            situacionEncontradaDTO.setViTitulo(viTitulo);
            situacionEncontradaDTO.setNiSistemaCoordenadas(niSistemaCoordenadas);
            situacionEncontradaDTO.setNiX(niX);
            situacionEncontradaDTO.setNiY(niY);
            situacionEncontradaDTO.setNiCota(niCota);
            situacionEncontradaDTO.setViIdUsuario(viIdUsuario);

        }catch (NumberFormatException ignored){}

        situacionEncontradaDTO.setCiTexto(ciTexto);
        situacionEncontradaDTO.setCiImagenes(ciImagenes);

        return  this.situacionEncontradaService.guardarSituacionE(situacionEncontradaDTO);
    }
}
