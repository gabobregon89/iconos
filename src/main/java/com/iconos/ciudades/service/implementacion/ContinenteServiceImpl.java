package com.iconos.ciudades.service.implementacion;

import java.util.List;

import com.iconos.ciudades.dto.ContinenteDto;
import com.iconos.ciudades.entity.ContinenteEntity;
import com.iconos.ciudades.mapper.ContinenteMapper;
import com.iconos.ciudades.repository.ContinenteRepository;
import com.iconos.ciudades.service.ContinenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    ContinenteMapper continenteMapper;

    @Autowired
    ContinenteRepository continenteRepository;
    
    public ContinenteDto save(ContinenteDto dto) {
        ContinenteEntity entity = continenteMapper.continenteDto2Entity(dto);
        ContinenteEntity entitySaved = continenteRepository.save(entity);
        ContinenteDto dtoSaved = continenteMapper.continenteEntity2Dto(entitySaved);
        return dtoSaved;
    }

    public List<ContinenteDto> getAllContinentes() {
        List<ContinenteEntity> entities = continenteRepository.findAll();
        List<ContinenteDto> dtosFinal = continenteMapper.continenteEntityList2DtoList(entities);
        return dtosFinal;
    }

}
