package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ConsultarTiposCoordenadasDTO;
import co.gov.coran.licencias.repository.ConsultarTiposCoordenadasRepository;
import co.gov.coran.licencias.service.ConsultarTiposCoordenadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
@Service
public class ConsultarTiposCoordenadasImpl implements ConsultarTiposCoordenadasService {
    @Autowired
    private ConsultarTiposCoordenadasRepository consultarTiposCoordenadasRepository;
    @Override
    public List<ConsultarTiposCoordenadasDTO> consultarTiposCoordenadas(BigDecimal niSecEEta, String viUsuario) {
        return consultarTiposCoordenadasRepository.tiposCoordenadas( niSecEEta, viUsuario);
    }
}
