package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ProblematicaBorrarDTO;
import co.gov.coran.licencias.repository.ProblematicaBorrarRepository;
import co.gov.coran.licencias.service.ProblematicaBorrarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblematicaBorrarImpl implements ProblematicaBorrarService {
    @Autowired
    private ProblematicaBorrarRepository problematicaBorrarRepository;
    @Override
    public String borraAfectacionAmbiente(ProblematicaBorrarDTO problematicaBorrarDTO) {
        return this.problematicaBorrarRepository.borrarAfectacionAmb(problematicaBorrarDTO);
    }
}
