package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarAnalisiDTO;
import co.gov.coran.licencias.repository.GuardarAnalisisRepository;
import co.gov.coran.licencias.service.GuardarAnalisisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardarAnalisisServiceImpl implements GuardarAnalisisService {
   @Autowired
   private GuardarAnalisisRepository guardarAnalisisRepository;

    @Override
    public GuardarAnalisiDTO guardarAnalisis(GuardarAnalisiDTO guardarAnalisiDTO) {
        return guardarAnalisisRepository.guardarAnalisis(guardarAnalisiDTO);
    }
}
