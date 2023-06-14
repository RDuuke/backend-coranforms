package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ListaColabora;
import co.gov.coran.licencias.service.ConsultaColaboradoresService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ConsultaColaboradoresController {
    public ConsultaColaboradoresService consultaColaboradoresService;

    public ConsultaColaboradoresController(ConsultaColaboradoresService consultaColaboradoresService) {
        this.consultaColaboradoresService = consultaColaboradoresService;
    }

    @GetMapping("/colaboradores_consulta")
    @ResponseStatus(HttpStatus.OK)
    public  @ResponseBody
    ListaColabora listaColabora(@RequestParam(name="niSecEEta") BigDecimal niSecEEta,
                                @RequestParam(name="viIdUsuario") String viIdUsuario
    ){
        return consultaColaboradoresService.listaColabora(niSecEEta,viIdUsuario);
    }
}
