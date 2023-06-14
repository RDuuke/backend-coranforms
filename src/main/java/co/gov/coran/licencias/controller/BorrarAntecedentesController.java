package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.GuardarAntecedenteRequestDTO;
import co.gov.coran.licencias.service.BorrarAntecedentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarAntecedentesController {


    @Autowired
    private BorrarAntecedentesService borrarAntecedentesService;

    @DeleteMapping("/borrar_antecedente")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    String borrarAntecedentes(
            @RequestParam(value = "niSecEEta") Double niSecEEta,
            @RequestParam(value = "niSecDoc") Double niSecDoc,
            @RequestParam(name = "viIdUsuario") String viIdUsuario
    ){
        GuardarAntecedenteRequestDTO guardarAntecedenteRequestDTO = new GuardarAntecedenteRequestDTO();

        guardarAntecedenteRequestDTO.setNiSecEEta(niSecEEta);
        guardarAntecedenteRequestDTO.setNiSecDoc(niSecDoc);
        guardarAntecedenteRequestDTO.setViIdUsuario(viIdUsuario);

        return this.borrarAntecedentesService.borrarAntecedentes(guardarAntecedenteRequestDTO);
    }


}
