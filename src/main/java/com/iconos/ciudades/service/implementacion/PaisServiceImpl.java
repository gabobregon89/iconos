package com.iconos.ciudades.service.implementacion;

import java.util.List;

import com.iconos.ciudades.dto.PaisDto;
import com.iconos.ciudades.entity.PaisEntity;
import com.iconos.ciudades.mapper.PaisMapper;
import com.iconos.ciudades.repository.PaisRepository;
import com.iconos.ciudades.service.PaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisMapper paisMapper;

    @Autowired
    private PaisRepository paisRepository;
    
    public PaisDto save(PaisDto dto) {
        PaisEntity entity = paisMapper.paisDto2Entity(dto);
        PaisEntity paisSaved = paisRepository.save(entity);
        PaisDto result = paisMapper.paisEntity2Dto(paisSaved);
        return result;
    }

    public List<PaisDto> getAllPaises() {
        List<PaisEntity> entities = paisRepository.findAll();
        List<PaisDto> dtos = paisMapper.paisEntityList2DtoList(entities);
        return dtos;
    }
}
