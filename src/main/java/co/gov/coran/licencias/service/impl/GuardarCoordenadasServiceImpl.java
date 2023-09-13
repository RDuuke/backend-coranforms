package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarCoordenadasDTO;
import co.gov.coran.licencias.repository.GuardarCoordenadasRepository;
import co.gov.coran.licencias.service.GuardarCoordenadasService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuardarCoordenadasServiceImpl implements GuardarCoordenadasService {

    private final GuardarCoordenadasRepository guardarCoordenadasRepository;

    public GuardarCoordenadasServiceImpl(GuardarCoordenadasRepository guardarCoordenadasRepository) {
        this.guardarCoordenadasRepository = guardarCoordenadasRepository;
    }

    @Override
    public List<GuardarCoordenadasDTO> guardarCoordenadas(List<GuardarCoordenadasDTO> guardarCoordenadasDTOList) {
        return guardarCoordenadasRepository.guardarCoord(guardarCoordenadasDTOList);
    }
}
