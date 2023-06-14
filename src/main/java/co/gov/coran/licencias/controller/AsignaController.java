package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.AdDTO;
import co.gov.coran.licencias.models.dto.ListaAsigna;
import co.gov.coran.licencias.service.AsignaService;
import co.gov.coran.licencias.service.ConexionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;

@RestController
public class AsignaController {


    public AsignaService asignaService;
    public ConexionAdService conexionAdService;
    public AsignaController(AsignaService asignaService) {this.asignaService = asignaService;}

    @GetMapping("/asignacionesF")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    ListaAsigna listaAsignaciones(@RequestParam(name= "viIdUsuario")String viIdUsuario){
        HttpHeaders httpHeaders = new HttpHeaders();

        return this.asignaService.listaAsigna( viIdUsuario);
    }



}
