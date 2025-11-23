package com.saver.gym_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.repository.GiornataRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GiornataService {


    private final GiornataRepository repository;

    public List<Giornata> getGiornate(){
        return repository.findAll();
    }

    public Giornata getGiornataById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Giornata setGiornata(Giornata giornata){
        return repository.save(giornata);
    }


}
