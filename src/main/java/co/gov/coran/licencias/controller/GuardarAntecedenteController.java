package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.AntecedentesResponse;
import co.gov.coran.licencias.models.dto.GuardarAntecedenteRequestDTO;
import co.gov.coran.licencias.service.AntecedenteGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class GuardarAntecedenteController {


    @Autowired
    private AntecedenteGuardarService antecedenteGuardarService;

    @PostMapping(value = "/guardar_antecedente")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String guardarAntecedentes(
                                @RequestParam(value = "niSecEEta") Double niSecEEta,
                                @RequestParam(value = "niSecDoc") Double niSecDoc,
                                @RequestParam(name = "viIdUsuario") String viIdUsuario
    ) {
        GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO = new GuardarAntecedenteRequestDTO();

           guardarAntecedenteRequestDTO.setNiSecEEta(niSecEEta);
           guardarAntecedenteRequestDTO.setNiSecDoc(niSecDoc);
           guardarAntecedenteRequestDTO.setViIdUsuario(viIdUsuario);

        return  this.antecedenteGuardarService.guardarAntecedentes(guardarAntecedenteRequestDTO);
    }
}
