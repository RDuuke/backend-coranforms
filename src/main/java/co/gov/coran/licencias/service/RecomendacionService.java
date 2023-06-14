package co.gov.coran.licencias.service;


import co.gov.coran.licencias.models.dto.RecomendacionDTO;

public interface RecomendacionService {
    RecomendacionDTO guardarRecomendacion(RecomendacionDTO recomendacionDTO);
    RecomendacionDTO guardarConclusion(RecomendacionDTO recomendacionDTO);
}
