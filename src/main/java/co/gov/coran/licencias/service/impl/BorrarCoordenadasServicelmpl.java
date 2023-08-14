package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarCoordenadasDTO;
import co.gov.coran.licencias.repository.BorrarCoordenadasRepository;
import co.gov.coran.licencias.service.BorrarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BorrarCoordenadasServicelmpl implements BorrarCoordenadasService {
    @Autowired
    private BorrarCoordenadasRepository borrarCoordenadasRepository;

    public String borrarCoordenada(BorrarCoordenadasDTO borrarCoordenadasDTO){
        return this.borrarCoordenadasRepository.borrarCoordenada(borrarCoordenadasDTO);
    }

}
