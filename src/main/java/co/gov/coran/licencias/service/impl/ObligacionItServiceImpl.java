package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.ObligacionesItDTO;
import co.gov.coran.licencias.models.dto.ObligacionesItListas;
import co.gov.coran.licencias.repository.Consultar_obliga_itRepository;
import co.gov.coran.licencias.service.ObligacionesItService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ObligacionItServiceImpl implements ObligacionesItService {

    private Consultar_obliga_itRepository consultar_obliga_itRepository;
    public ObligacionItServiceImpl(Consultar_obliga_itRepository consultar_obliga_itRepository){
        this.consultar_obliga_itRepository = consultar_obliga_itRepository;
    }

    @Override
    public ObligacionesItListas obligacionesItListas(BigDecimal niSecEETA, String niSecTer) {

        ObligacionesItListas obligacionesItListas = new ObligacionesItListas();
        List<Object> objects = consultar_obliga_itRepository.ObligacionesItListas(niSecEETA,niSecTer);
        List<ObligacionesItDTO> obligacionesIt = new ArrayList<>();


        for(Object obligacionIt:objects ){
            obligacionesItListas.setResult(Boolean.TRUE);
            Object[] oblIt = (Object[]) obligacionIt;

            ObligacionesItDTO obligacionesItDTO = new ObligacionesItDTO();
            obligacionesItDTO.setExp_sec((BigDecimal) oblIt[0] );
            obligacionesItDTO.setLinea((BigDecimal) oblIt[1]);
            obligacionesItDTO.setTer_documento((String) oblIt[2]);
            obligacionesItDTO.setTer_Nombres((String) oblIt[3]);
            obligacionesItDTO.setDoc_sec((BigDecimal) oblIt[4]);
            obligacionesItDTO.setDoc_fecha((Date) oblIt[5]);
            obligacionesItDTO.setDoc_radicado((String) oblIt[6]);
            obligacionesItDTO.setObligacion((String) oblIt[7]);
            obligacionesItDTO.setPlazo_meses((BigDecimal) oblIt[8]);
            obligacionesItDTO.setPeriodica((String) oblIt[9]);
            obligacionesItDTO.setCumplio((String) oblIt[10]);
            obligacionesItDTO.setObservaciones((String) oblIt[11]);
            obligacionesItDTO.setMotivo_parcial((String) oblIt[12]);
            obligacionesItDTO.setFecha_creacion((Date) oblIt[13]);
            obligacionesItDTO.setCreado_por((String) oblIt[14]);

            obligacionesIt.add(obligacionesItDTO);

        }
        obligacionesItListas.setLista_obligacionesIt(obligacionesIt);
        return obligacionesItListas;
    }


}
