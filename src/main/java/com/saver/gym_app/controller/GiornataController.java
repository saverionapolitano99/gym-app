package com.saver.gym_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.dto.giornata.GiornataResponse;
import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.mapper.GiornataMapper;
import com.saver.gym_app.service.GiornataService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/giornate")
public class GiornataController {

    private final GiornataService service;
    private final GiornataMapper mapper;
    @GetMapping
    public List<Giornata> getGiornate(){
        return service.getGiornate();
    }

    @GetMapping("/{id}")
    public Giornata getGiornataById(@PathVariable Long id){
        return service.getGiornataById(id);
    }

    @PostMapping
    public GiornataResponse setGiornata(@RequestBody Giornata giornata){
        Giornata giornataResp = service.setGiornata(giornata);
        return mapper.toResponse(giornataResp);
    }




}
