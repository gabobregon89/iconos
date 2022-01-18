package com.iconos.ciudades.mapper;

import java.util.ArrayList;
import java.util.List;

import com.iconos.ciudades.dto.PaisDto;
import com.iconos.ciudades.entity.PaisEntity;

import org.springframework.stereotype.Component;

@Component
public class PaisMapper {
    
    public PaisEntity paisDto2Entity(PaisDto dto) {
        PaisEntity paisEntity = new PaisEntity();
        paisEntity.setImagen(dto.getImagen());
        paisEntity.setDenominacion(dto.getDenominacion());
        paisEntity.setCantHabitantes(dto.getCantHabitantes());
        paisEntity.setSuperficie(dto.getSuperficie());
        paisEntity.setContinenteId(dto.getContinenteId());
        return paisEntity;
    }

    public PaisDto paisEntity2Dto(PaisEntity entity) {
        PaisDto dto = new PaisDto();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setCantHabitantes(entity.getCantHabitantes());
        dto.setSuperficie(entity.getSuperficie());
        dto.setContinenteId(entity.getContinenteId());
        return dto;
    }

    public List<PaisDto> paisEntityList2DtoList(List<PaisEntity> entities) {
        List<PaisDto> dtos = new ArrayList<>();
        for (PaisEntity entity : entities) {
            dtos.add(paisEntity2Dto(entity));
        }
        return dtos;
    }
}
