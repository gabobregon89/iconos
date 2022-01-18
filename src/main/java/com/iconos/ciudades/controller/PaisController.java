package com.iconos.ciudades.controller;

import java.util.List;

import com.iconos.ciudades.dto.PaisDto;
import com.iconos.ciudades.service.PaisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paises")
public class PaisController {
    
    @Autowired
    private PaisService paisService;

    @PostMapping
    public ResponseEntity<PaisDto> save(@RequestBody PaisDto pais) {
        PaisDto paisSaved = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisSaved);
    }

    @GetMapping
    public ResponseEntity<List<PaisDto>> getAll() {
        List<PaisDto> paises = paisService.getAllPaises();
        return ResponseEntity.ok().body(paises);
    }
}
