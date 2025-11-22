package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.repository.GiornataRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/giornate")
public class GiornataController {

    private final GiornataRepository repository;
    @GetMapping
    public List<Giornata> getGiornate(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Giornata getGiornataById(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Giornata setGiornata(@RequestBody Giornata giornata){
        return repository.save(giornata);
    }




}
