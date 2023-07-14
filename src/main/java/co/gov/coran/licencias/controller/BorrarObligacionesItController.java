package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarObligacionDTO;
import co.gov.coran.licencias.repository.BorrarObligacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
@RestController
public class BorrarObligacionesItController {

    @Autowired
    private BorrarObligacionRepository borrarObligacionService;

    @PostMapping("/borrar_obligacion")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarObligacion(@RequestBody BorrarObligacionDTO borrarObligacionDTO){
        return this.borrarObligacionService.borrarObligacion(borrarObligacionDTO);

    }

}
