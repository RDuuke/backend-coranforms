package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ProblematicaGuardarDTO;
import co.gov.coran.licencias.repository.ProblematicaGuardarRepository;
import co.gov.coran.licencias.service.ProblematicaGuardarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblematicaGuardarImpl implements ProblematicaGuardarService {
    @Autowired
    private ProblematicaGuardarRepository problematicaGuardarRepository;
    @Override
    public ProblematicaGuardarDTO guardarProblematica(ProblematicaGuardarDTO ProblematicaGuardarDTO) {
        return problematicaGuardarRepository.guardarProblematica(ProblematicaGuardarDTO);
    }
}
