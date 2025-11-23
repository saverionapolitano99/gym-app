package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.entity.Esercizio;
import com.saver.gym_app.service.EsercizioService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/esercizi")
public class EsercizioController {
    
    private final EsercizioService service;
    
    
    // GET /api/esercizi - Ritorna tutti gli esercizi
    @GetMapping
    public List<Esercizio> getAll() {
        return service.getAll();
    }
    
    // GET /api/esercizi/{id} - Ritorna un esercizio per ID
    @GetMapping("/{id}")
    public Esercizio getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    // POST /api/esercizi - Crea un nuovo esercizio
    @PostMapping
    public Esercizio create(@RequestBody Esercizio esercizio) {
        return service.create(esercizio);
    }
}