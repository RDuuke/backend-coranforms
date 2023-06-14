package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.ListaFirmantes;
import co.gov.coran.licencias.models.dto.ListaFirmantesDTO;
import co.gov.coran.licencias.service.ConsultaFirmanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ConsultaFirmantesController {


    public ConsultaFirmanteService consultaFirmanteService;

    ConsultaFirmantesController( ConsultaFirmanteService consultaFirmanteService){
        this.consultaFirmanteService = consultaFirmanteService;
    }

    @GetMapping("/firmas")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    ListaFirmantes listaFirmantes(@RequestParam(name="niSecEETA") BigDecimal niSecEETA){
        return consultaFirmanteService.listaFirmantes(niSecEETA);
    }
    @GetMapping("/firma_unico")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    ListaFirmantes listaFirmante(@RequestParam(name="viIdUsuario") String viIdUsuario){
        return consultaFirmanteService.listaFirmante(viIdUsuario);
    }
}
