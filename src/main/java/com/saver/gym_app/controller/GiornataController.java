package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.service.GiornataService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/giornate")
public class GiornataController {

    private final GiornataService service;
    @GetMapping
    public List<Giornata> getGiornate(){
        return service.getGiornate();
    }

    @GetMapping("/{id}")
    public Giornata getGiornataById(@PathVariable Long id){
        return service.getGiornataById(id);
    }

    @PostMapping
    public Giornata setGiornata(@RequestBody Giornata giornata){
        return service.setGiornata(giornata);
    }




}
