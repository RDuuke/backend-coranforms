package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.BorrarAnalisisInfoDTO;
import co.gov.coran.licencias.service.BorrarAnalisisInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrarAnalisisInfoController {

    @Autowired
    private BorrarAnalisisInfoService borrarAnalisisInfoService;

    @PostMapping("/borrar_analisis_info")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String borrarAnalisisInfoService(@RequestBody BorrarAnalisisInfoDTO borrarAnalisisInfoDTO){
        return this.borrarAnalisisInfoService.borrarAnalisisInfo(borrarAnalisisInfoDTO);
    }


}
