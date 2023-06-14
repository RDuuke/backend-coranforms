package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.BorrarFirmanteDTO;
import co.gov.coran.licencias.service.BorrarFirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class BorrarFirmaController {
    @Autowired
    private BorrarFirmaService borrarFirmaService;

    @DeleteMapping("/borrar_firma")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarFirma(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
        BorrarFirmanteDTO borrarFirmanteDTO = new BorrarFirmanteDTO();

        borrarFirmanteDTO.setNiSecEETA(niSecEEta);
        borrarFirmanteDTO.setViIdUsuario(viIdUsuario);

        return this.borrarFirmaService.borrarFirma(borrarFirmanteDTO);
    }
}
