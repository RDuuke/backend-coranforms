package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.RecomendacionDTO;
import co.gov.coran.licencias.service.RecomendacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
public class GuardarRecomendacionController {
    @Autowired

    private RecomendacionService recomendacionService;

    @PostMapping(value="/guardar_recomendacion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    RecomendacionDTO guardarRecomendacion(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") String nioLinea,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestParam(value = "viIdUsuario") String viIdUsuario
    ) throws IOException, SQLException {
        RecomendacionDTO recomendacionDTO= new RecomendacionDTO();
        try {
            recomendacionDTO.setNiSecEEta(niSecEEta);
            recomendacionDTO.setNioLinea(String.valueOf(nioLinea));
            recomendacionDTO.setViIdUsuario(viIdUsuario);

        }catch (NumberFormatException ignored){}

           recomendacionDTO.setCiTexto(ciTexto);


        return  this.recomendacionService.guardarRecomendacion(recomendacionDTO);
    }

      @PostMapping(value="/guardar_conclusion")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
      RecomendacionDTO guardarConclusion(
            @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
            @RequestParam(value = "nioLinea") String nioLinea,
            @RequestParam(value = "ciTexto") String ciTexto,
            @RequestParam(value = "viIdUsuario") String viIdUsuario
    ) throws IOException, SQLException {
        RecomendacionDTO recomendacionDTO= new RecomendacionDTO();
        try {
            recomendacionDTO.setNiSecEEta(niSecEEta);
            recomendacionDTO.setNioLinea(String.valueOf(nioLinea));

            recomendacionDTO.setViIdUsuario(viIdUsuario);
        }catch (NumberFormatException ignored){}

        recomendacionDTO.setCiTexto(ciTexto);

        return  this.recomendacionService.guardarConclusion(recomendacionDTO);
    }

}
