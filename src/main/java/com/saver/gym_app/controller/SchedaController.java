package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.entity.Scheda;
import com.saver.gym_app.repository.SchedaRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/schede")
public class SchedaController {

    private final SchedaRepository repository;
    @GetMapping
    public List<Scheda> getSchede(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Scheda getSchedaById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping("create")
    public Scheda setSchedaBy(@RequestBody Scheda scheda){
        return repository.save(scheda);
    }


}
