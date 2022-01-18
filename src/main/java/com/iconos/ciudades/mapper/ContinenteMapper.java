package com.iconos.ciudades.mapper;

import java.util.ArrayList;
import java.util.List;

import com.iconos.ciudades.dto.ContinenteDto;
import com.iconos.ciudades.entity.ContinenteEntity;

import org.springframework.stereotype.Component;

@Component
public class ContinenteMapper {
    
    public ContinenteEntity continenteDto2Entity(ContinenteDto dto) {
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }

    public ContinenteDto continenteEntity2Dto(ContinenteEntity entity) {
        ContinenteDto dto = new ContinenteDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }

    public List<ContinenteDto> continenteEntityList2DtoList(List<ContinenteEntity> entities) {
        List<ContinenteDto> dtos = new ArrayList<>();
        for (ContinenteEntity entity : entities) {
            dtos.add(continenteEntity2Dto(entity));
        }
        return dtos;
    }
}
