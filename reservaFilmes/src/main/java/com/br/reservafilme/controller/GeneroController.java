package com.br.reservafilme.controller;


import com.br.reservafilme.entity.Genero;
import com.br.reservafilme.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    GeneroService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Genero> create(@RequestBody Genero genero) {
        Genero generoCreated = service.create(genero);

        return ResponseEntity.status(201).body(generoCreated);
    }
}
