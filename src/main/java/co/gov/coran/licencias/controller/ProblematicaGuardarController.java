package co.gov.coran.licencias.controller;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;
import co.gov.coran.licencias.service.ProblematicaGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
public class ProblematicaGuardarController {
    @Autowired
    private ProblematicaGuardarService problematicaGuardarService;

     @PostMapping(value = "/guardar_problematica")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
     ProblematicaGuardarDTO guardarProblematica(
                                @RequestParam(value = "niSecEEta") BigDecimal niSecEEta,
                                @RequestParam(value = "nioLinea") String nioLinea,
                                @RequestParam(name = "viUsuario") String viUsuario,
                                @RequestParam(value = "viTipo") String viTipo,
                                 @RequestParam(value = "niIntensidad") BigDecimal niIntensidad,
                                 @RequestParam(value = "niExtension") BigDecimal niExtension,
                                 @RequestParam(value = "niPersistencia") BigDecimal niPersistencia,
                                 @RequestParam(value = "niReversibilidad") BigDecimal niReversibilidad,
                                 @RequestParam(value = "niRecuperabilidad") BigDecimal niRecuperabilidad,
                                 @RequestParam(value = "niProbabilidadOcurrencia") BigDecimal niProbabilidadOcurrencia,
                                @RequestParam(value = "ciJustificacionImportancia") String ciJustificacionImportancia,
                                @RequestParam(value = "ciJustificacionriesgo") String ciJustificacionriesgo,
                                @RequestParam(value = "ciJustificacionGnral") String ciJustificacionGnral,
                                @RequestParam(value = "ciJustificacionAgentes") String ciJustificacionAgentes,
                                @RequestParam(value = "tiAgentesPeligro") ArrayList<String> tiAgentesPeligro
    ) {
        ProblematicaGuardarDTO problematicaGuardarDTO = new ProblematicaGuardarDTO();

         problematicaGuardarDTO.setNiSecEEta(niSecEEta);
         problematicaGuardarDTO.setNioLinea(nioLinea);
         problematicaGuardarDTO.setViUsuario(viUsuario);
         problematicaGuardarDTO.setViTipo(viTipo);
         problematicaGuardarDTO.setNiIntensidad(niIntensidad);
         problematicaGuardarDTO.setNiExtension(niExtension);
         problematicaGuardarDTO.setNiPersistencia(niPersistencia);
         problematicaGuardarDTO.setNiReversibilidad(niReversibilidad);
         problematicaGuardarDTO.setNiRecuperabilidad(niRecuperabilidad);
         problematicaGuardarDTO.setNiProbabilidadOcurrencia(niProbabilidadOcurrencia);
         problematicaGuardarDTO.setJustificacion_importancia(ciJustificacionImportancia);
         problematicaGuardarDTO.setJustificacion_riesgo(ciJustificacionriesgo);
         problematicaGuardarDTO.setJustificacion_gnral(ciJustificacionGnral);
         problematicaGuardarDTO.setJustificacion_agente(ciJustificacionAgentes);
         problematicaGuardarDTO.setTipos_agente_peligro(tiAgentesPeligro);

        return  this.problematicaGuardarService.guardarProblematica(problematicaGuardarDTO);
    }

}
