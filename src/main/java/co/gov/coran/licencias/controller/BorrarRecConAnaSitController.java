package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarRecConAnaSituacionDTO;
import co.gov.coran.licencias.service.BorrarRecConAnaSituService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class BorrarRecConAnaSitController {
    @Autowired
    private BorrarRecConAnaSituService borrarRecConAnaSituService;

     @DeleteMapping("/borrar_recomendacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarRecConAnaSit(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "nioLinea") BigDecimal nioLinea,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
         BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO= new BorrarRecConAnaSituacionDTO();

         borrarRecConAnaSituacionDTO.setNiSecEEta(niSecEEta);
         borrarRecConAnaSituacionDTO.setNioLinea(nioLinea);
         borrarRecConAnaSituacionDTO.setViIdUsuario(viIdUsuario);

        return this.borrarRecConAnaSituService.borrarRecConAnaSit(borrarRecConAnaSituacionDTO);
    }

    @DeleteMapping("/borrar_conclusion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarConclusion(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "nioLinea") BigDecimal nioLinea,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
        BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO= new BorrarRecConAnaSituacionDTO();

        borrarRecConAnaSituacionDTO.setNiSecEEta(niSecEEta);
        borrarRecConAnaSituacionDTO.setNioLinea(nioLinea);
        borrarRecConAnaSituacionDTO.setViIdUsuario(viIdUsuario);

        return this.borrarRecConAnaSituService.borrarConclusion(borrarRecConAnaSituacionDTO);
    }
    @DeleteMapping("/borrar_analisis")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarAnalisis(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "nioLinea") BigDecimal nioLinea,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
        BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO= new BorrarRecConAnaSituacionDTO();

        borrarRecConAnaSituacionDTO.setNiSecEEta(niSecEEta);
        borrarRecConAnaSituacionDTO.setNioLinea(nioLinea);
        borrarRecConAnaSituacionDTO.setViIdUsuario(viIdUsuario);

        return this.borrarRecConAnaSituService.borrarAnalisis(borrarRecConAnaSituacionDTO);
    }

    @DeleteMapping("/borrar_situacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarSitu(
            @RequestParam(name = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(name = "nioLinea") BigDecimal niLinea,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
        BorrarRecConAnaSituacionDTO borrarRecConAnaSituacionDTO= new BorrarRecConAnaSituacionDTO();

        borrarRecConAnaSituacionDTO.setNiSecEEta(niSecEEta);
        borrarRecConAnaSituacionDTO.setNiLinea(niLinea);
        borrarRecConAnaSituacionDTO.setViIdUsuario(viIdUsuario);

        return this.borrarRecConAnaSituService.borrarSitu(borrarRecConAnaSituacionDTO);
    }
}
