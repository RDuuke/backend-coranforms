package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarAnalisiDTO;
import co.gov.coran.licencias.service.GuardarAnalisisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class GuardarAnalisisController {

    @Autowired
    private GuardarAnalisisService guardarAnalisisService;

    @PostMapping(value="/guardar_analisis")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    GuardarAnalisiDTO guardarAnalisis(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") String nioLinea,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestParam(value = "viIdUsuario") String viIdUsuario
    ) throws IOException, SQLException {
        GuardarAnalisiDTO guardarAnalisiDTO = new GuardarAnalisiDTO();

            guardarAnalisiDTO.setNiSecEEta(niSecEEta);
            guardarAnalisiDTO.setNioLinea(String.valueOf(nioLinea));
            guardarAnalisiDTO.setViIdUsuario(viIdUsuario);
             guardarAnalisiDTO.setCiTexto(ciTexto);


        return  this.guardarAnalisisService.guardarAnalisis(guardarAnalisiDTO);
    }

}
