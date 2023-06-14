package co.gov.coran.licencias.service.impl;


import co.gov.coran.licencias.models.dto.BorrarFirmanteDTO;
import co.gov.coran.licencias.repository.GuardarFirmaRepository;
import co.gov.coran.licencias.service.BorrarFirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BorrarFirmaImpl implements BorrarFirmaService {

    @Autowired
    private GuardarFirmaRepository guardarFirmaRepository;
    @Override
    public String borrarFirma(BorrarFirmanteDTO borrarFirmanteDTO) {
        return guardarFirmaRepository.borrarFirma(borrarFirmanteDTO);
    }
}
