package com.iconos.ciudades.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "icono")
public class IconoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    private String denominacion;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate fechaCreacion;

    private Long altura;
    
    private String historia;
    
    @ManyToMany(mappedBy = "iconos", cascade = CascadeType.ALL)
    private List<PaisEntity> paises = new ArrayList<>();

    
}
