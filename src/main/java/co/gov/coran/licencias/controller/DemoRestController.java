/*
package com.praveen.jasypt.example.controller;

import com.praveen.jasypt.example.config.DemoConfigProperties;
import com.praveen.jasypt.example.models.dto.AdDTO;
import com.praveen.jasypt.example.service.ConexionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoRestController {

    @Autowired
    private DemoConfigProperties demoConfigProperties;
    private com.praveen.jasypt.example.service.ExpedienteService expedienteService;

    public DemoRestController (com.praveen.jasypt.example.service.ExpedienteService expedienteService) {
        this.expedienteService = expedienteService;
    }
    //public  DemoRestController(ConexionAdService conexionAdService){this.conexionAdService = conexionAdService;}
    @PostMapping(value = "/lista-expedientes")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    com.praveen.jasypt.example.models.dto.ListaExpedientes listaExpedientes(@RequestParam(name = "sequenceThirdParty") Integer sequenceThirdParty) {
        return this.expedienteService.listarExpedientes(sequenceThirdParty);
    }
    @GetMapping("/health")
    public String health() {
        return HttpStatus.OK.name();
    }

    @GetMapping("/app-configs")
    public String getConfigs() {
        return demoConfigProperties.toString();
    }

*/
/*    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    AdDTO adDTO(HttpServletRequest request, @RequestBody AdDTO adDTO){
        return conexionAdService.conexionAd(adDTO);
    }*//*

}
*/
