package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.EditarCoordenadasDTO;
import co.gov.coran.licencias.repository.GuardarCoordenadasRepository;
import co.gov.coran.licencias.service.EditarCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EditarCoordenadasServiceImpl implements EditarCoordenadasService {

    @Autowired
    private GuardarCoordenadasRepository guardarCoordenadasRepository;
    @Override
    public EditarCoordenadasDTO guardarCoord(EditarCoordenadasDTO editarCoordenadasDTO) {
        return guardarCoordenadasRepository.guardarCoord(editarCoordenadasDTO);
    }
}
