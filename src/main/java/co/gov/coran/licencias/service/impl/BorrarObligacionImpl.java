package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarObligacionDTO;
import co.gov.coran.licencias.repository.BorrarObligacionRepository;
import co.gov.coran.licencias.service.BorrarObligacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarObligacionImpl implements BorrarObligacionService {

    @Autowired
    private BorrarObligacionRepository borrarObligacionRepository;

    public String borrarObligacion(BorrarObligacionDTO borrarObligacionDTO){

        return this.borrarObligacionRepository.borrarObligacion(borrarObligacionDTO);

    }

}
