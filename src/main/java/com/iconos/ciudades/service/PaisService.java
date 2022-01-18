package com.iconos.ciudades.service;

import java.util.List;

import com.iconos.ciudades.dto.PaisDto;

public interface PaisService {
    
    public PaisDto save(PaisDto dto);

    public List<PaisDto> getAllPaises();
}
