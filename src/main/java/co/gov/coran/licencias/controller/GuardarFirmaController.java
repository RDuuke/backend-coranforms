package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.GuardarFirmaDTO;
import co.gov.coran.licencias.service.GuardarFirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class GuardarFirmaController {

    @Autowired
    private GuardarFirmaService guardarFirmaService;

    @PostMapping(value = "/guardar_firma")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    GuardarFirmaDTO guardarFirma(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "viIdUsuario") String viIdUsuario,
            @RequestParam(value = "niHoras") BigDecimal niHoras,
            @RequestParam(value = "niMins") BigDecimal niMins,
            @RequestParam(value = "file") MultipartFile file
    ) throws IOException, SQLException {
        GuardarFirmaDTO guardarFirmaDTO = new GuardarFirmaDTO();
try {
    guardarFirmaDTO.setNiSecEETA(niSecEEta);
    guardarFirmaDTO.setViIdUsuario(viIdUsuario);
    guardarFirmaDTO.setNiHoras(niHoras);
    guardarFirmaDTO.setNiMins(niMins);
}catch (NumberFormatException ignored){}


        guardarFirmaDTO.setBliFirma(new SerialBlob((file.getBytes())));

         return  this.guardarFirmaService.guardarFirma(guardarFirmaDTO);
    }

}
