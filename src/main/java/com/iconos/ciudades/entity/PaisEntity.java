package com.iconos.ciudades.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "pais")
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    
    private String denominacion;
    
    @Column(name = "cant_habitantes")
    private Long cantHabitantes;
    
    private Long superficie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable = false, updatable = false)
    private ContinenteEntity continente;

    @Column(name = "continente_id", nullable = false)
    private Long continenteId;

    @ManyToMany(
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(
        name = "iconos_pais",
        joinColumns = @JoinColumn(name = "pais_id"),
        inverseJoinColumns = @JoinColumn(name = "icono_id")
    )
    private List<IconoEntity> iconos = new ArrayList<>();
}
