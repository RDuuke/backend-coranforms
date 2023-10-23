package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.SituacionGuardarDTO;
import co.gov.coran.licencias.service.SituacionGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Base64;

@RestController
public class SituacionGuardarController {
    @Autowired
    private SituacionGuardarService situacionGuardarService;

    @PostMapping(value = "/guardar_situacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody SituacionGuardarDTO guardarSituacionE(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") String nioLinea,
            @RequestParam(value = "viTipo") String viTipo,
            @RequestParam(value = "niLineaObliga") String niLineaObliga,
            @RequestParam(value = "viTitulo") String viTitulo,
            @RequestParam(value = "niSistemaCoordenadas") BigDecimal niSistemaCoordenadas,
            @RequestParam(value = "niX") BigDecimal niX,
            @RequestParam(value = "niY") BigDecimal niY,
            @RequestParam(value = "niCota") BigDecimal niCota,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestPart(value = "ciImagenes") MultipartFile  ciImagenes,
            @RequestParam(value = "viIdUsuario") String viIdUsuario
    ) throws IOException, SQLException {
        SituacionGuardarDTO situacionGuardarDTO = new SituacionGuardarDTO();

        try {
            situacionGuardarDTO.setNiSecEEta(niSecEEta);
            situacionGuardarDTO.setNioLinea(String.valueOf(nioLinea));
            situacionGuardarDTO.setViTipo(viTipo);
            situacionGuardarDTO.setNiLineaObliga(String.valueOf(niLineaObliga));
            situacionGuardarDTO.setViTitulo(viTitulo);
            situacionGuardarDTO.setNiSistemaCoordenadas(niSistemaCoordenadas);
            situacionGuardarDTO.setNiX(niX);
            situacionGuardarDTO.setNiY(niY);
            situacionGuardarDTO.setNiCota(niCota);
            situacionGuardarDTO.setCiTexto(ciTexto);
            situacionGuardarDTO.setViIdUsuario(viIdUsuario);

        } catch (NumberFormatException ignored) {}

        String imageBase64 = Base64.getEncoder().encodeToString(ciImagenes.getBytes());
        situacionGuardarDTO.setCiImagenes(imageBase64);

        return this.situacionGuardarService.guardarSituacionEncontrada(situacionGuardarDTO);
    }
}






