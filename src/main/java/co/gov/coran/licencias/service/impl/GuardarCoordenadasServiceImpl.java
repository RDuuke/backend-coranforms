package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;
import co.gov.coran.licencias.repository.GuardarCoordenadasRepository;
import co.gov.coran.licencias.service.GuardarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GuardarCoordenadasServiceImpl implements GuardarCoordenadasService {

    @Autowired
    private GuardarCoordenadasRepository guardarCoordenadasRepository;
    @Override
    public GuardarCoordenadasDTO guardarCoord(GuardarCoordenadasDTO guardarCoordenadasDTO) {
        return guardarCoordenadasRepository.guardarCoord(guardarCoordenadasDTO);
    }
}
