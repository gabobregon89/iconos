package com.iconos.ciudades.repository;

import com.iconos.ciudades.entity.PaisEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity, Long> {
    
}
