package com.iconos.ciudades.service;

import java.util.List;

import com.iconos.ciudades.dto.ContinenteDto;

public interface ContinenteService {
    
    public ContinenteDto save(ContinenteDto dto);

    public List<ContinenteDto> getAllContinentes();
}
