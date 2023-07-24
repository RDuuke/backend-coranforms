package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarAntecedenteDTO;
import co.gov.coran.licencias.service.BorrarAntecedenteGnralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarAntecedenteGnralImpl implements BorrarAntecedenteGnralService {

    @Autowired
    private BorrarAntecedenteGnralService borrarAntecedenteGnralService;

    @Override
    public String borrarAntecedenteGnral(BorrarAntecedenteDTO borrarAntecedenteDTO){
        return this.borrarAntecedenteGnralService.borrarAntecedenteGnral(borrarAntecedenteDTO);
    }

}
