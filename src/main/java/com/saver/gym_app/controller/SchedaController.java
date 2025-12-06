package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.dto.scheda.SchedaRequest;
import com.saver.gym_app.entity.Scheda;
import com.saver.gym_app.mapper.SchedaMapper;
import com.saver.gym_app.service.SchedaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/schede")
public class SchedaController {

    private final SchedaService service;
    private final SchedaMapper mapper;
    @GetMapping
    public List<Scheda> getSchede(){
        return service.getSchede();
    }

    @GetMapping("/{id}")
    public Scheda getSchedaById(@PathVariable Long id){
        return service.getSchedaById(id);
    }

    @PostMapping("create")
    public Long setSchedaBy(@RequestBody SchedaRequest scheda){

        Scheda schedaResponse = service.setSchedaBy(mapper.toFilter(scheda));

        return schedaResponse.getId();
    }


}
