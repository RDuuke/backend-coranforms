package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.GuardarTerminarInformeDTO;
import co.gov.coran.licencias.service.GuardarTerminarInformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class GuardarTerminarInformeController {
    @Autowired
    private GuardarTerminarInformeService guardarTerminarInformeService;

    @PostMapping(value="/terminar_informe")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
            GuardarTerminarInformeDTO guardarTerInf(
                    @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
                    @RequestParam(value = "viIdUsuario") String viIdUsuario
            )throws IOException, SQLException{
                GuardarTerminarInformeDTO guardarTerminarInformeDTO = new GuardarTerminarInformeDTO();

                    guardarTerminarInformeDTO.setNiSecEEta(niSecEEta);
                    guardarTerminarInformeDTO.setViIdUsuario(viIdUsuario);

                    return this.guardarTerminarInformeService.guardarTerInforme(guardarTerminarInformeDTO);
        }
}
