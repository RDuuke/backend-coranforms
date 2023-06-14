package co.gov.coran.licencias.controller;


import co.gov.coran.licencias.models.dto.AdDTO;
import co.gov.coran.licencias.service.ConexionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value="/resource")
public class LoginController {

  public ConexionAdService conexionAdService;

  LoginController(ConexionAdService conexionAdService){
      this.conexionAdService = conexionAdService;
  }
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
  AdDTO adDTO(HttpServletRequest request, @RequestBody AdDTO adDTO){
       return conexionAdService.conexionAd(adDTO);
   }




}
