package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.models.dto.BorrarAntecedenteGnralDTO;
import co.gov.coran.licencias.repository.BorrarAntecedenteGnralRepository;
import co.gov.coran.licencias.service.BorrarAntecedenteGnralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarAntecedenteGnralImpl implements BorrarAntecedenteGnralService {

    @Autowired
    private BorrarAntecedenteGnralRepository borrarAntecedenteGnralRepository;

    @Override
    public String borrarAntecedenteGnral(BorrarAntecedenteGnralDTO borrarAntecedenteGnralDTO){
        return this.borrarAntecedenteGnralRepository.borrarAntecedenteGnral(borrarAntecedenteGnralDTO);
    }

}
