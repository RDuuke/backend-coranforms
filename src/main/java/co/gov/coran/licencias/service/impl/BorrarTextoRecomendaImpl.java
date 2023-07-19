package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarTextoRecomendaDTO;
import co.gov.coran.licencias.repository.BorrarTextoRecomendaRepository;
import co.gov.coran.licencias.service.BorrarTextoRecomendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarTextoRecomendaImpl implements BorrarTextoRecomendaService {

    @Autowired
    private BorrarTextoRecomendaRepository borrarTextoRecomendaRepository;

    @Override
    public String borrarTextoRecomenda(BorrarTextoRecomendaDTO borrarTextoRecomendaDTO){
        return borrarTextoRecomendaRepository.borrarTextoRecomenda(borrarTextoRecomendaDTO);
    }

}
