package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.BorrarAnalisisInfoDTO;
import co.gov.coran.licencias.repository.BorrarAnalisisInfoRepository;
import co.gov.coran.licencias.service.BorrarAnalisisInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrarAnalisisInfoImpl implements BorrarAnalisisInfoService {

    @Autowired
    private BorrarAnalisisInfoRepository borrarAnalisisInfoRepository;

    @Override
    public String borrarAnalisisInfo(BorrarAnalisisInfoDTO borrarAnalisisInfoDTO){
        return this.borrarAnalisisInfoRepository.borrarAnalisisInfo(borrarAnalisisInfoDTO);
    }


}
