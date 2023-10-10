package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarSituacionEncontradaObligacionDTO;
import co.gov.coran.licencias.repository.BorrarSituacionEncontradaObligacionRepository;
import co.gov.coran.licencias.service.BorrarSituacionEncontradaObligacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarSituacionEncontradaObligacionImpl implements BorrarSituacionEncontradaObligacionService {

    @Autowired
    private BorrarSituacionEncontradaObligacionRepository borrarObligacionRepository;

    public String borrarSituacionEncontrada(BorrarSituacionEncontradaObligacionDTO borrarSituacionEncontradaObligacionDTO){
        return this.borrarObligacionRepository.borrarSituacionEncontradaObligacion(borrarSituacionEncontradaObligacionDTO);

    }

}
