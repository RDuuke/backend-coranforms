package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.AntecedenteGeneralDTO;
import co.gov.coran.licencias.service.GuardarGeneralAntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class GuardarGeneralAntController {
    @Autowired
    private GuardarGeneralAntService guardarGeneralAntService;

    @PostMapping(value="/guardar_general_ant")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    AntecedenteGeneralDTO guardarGeneralAn(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") String nioLinea,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestParam(value = "viIdUsuario") String viIdUsuario
    ) throws IOException, SQLException {
        AntecedenteGeneralDTO antecedenteGeneralDTO = new AntecedenteGeneralDTO();

            antecedenteGeneralDTO.setNiSecEEta(niSecEEta);
            antecedenteGeneralDTO.setNioLinea(String.valueOf(nioLinea));
            antecedenteGeneralDTO.setViIdUsuario(viIdUsuario);



            antecedenteGeneralDTO.setCiTexto(ciTexto);


        return  this.guardarGeneralAntService.guardarGeneralAn(antecedenteGeneralDTO);
    }
}
