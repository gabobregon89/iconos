package com.iconos.ciudades.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter

@Entity
@Table(name = "continente")
public class ContinenteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    private String denominacion;


}


