package com.iconos.ciudades.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PaisDto {
    private Long id;
    private String imagen; 
    private String denominacion;
    private Long cantHabitantes;
    private Long superficie;
    private Long continenteId;
}
