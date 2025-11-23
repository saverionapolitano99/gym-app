package com.saver.gym_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saver.gym_app.entity.Scheda;
import com.saver.gym_app.repository.SchedaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchedaService {

    private final SchedaRepository repository;

    public List<Scheda> getSchede(){
        return repository.findAll();
    }

    public Scheda getSchedaById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Scheda setSchedaBy(Scheda scheda){
        return repository.save(scheda);
    }
}
