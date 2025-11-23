package com.saver.gym_app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.saver.gym_app.entity.Esercizio;
import com.saver.gym_app.repository.EsercizioRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EsercizioService {

    private final EsercizioRepository repository;

    public List<Esercizio> getAll() {
        return repository.findAll();
    }

    public Esercizio getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    
    public Esercizio create(Esercizio esercizio) {
        return repository.save(esercizio);
    }
}
