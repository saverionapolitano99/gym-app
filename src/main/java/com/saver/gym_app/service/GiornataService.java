package com.saver.gym_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saver.gym_app.dto.giornata.GiornataDto;
import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.entity.Scheda;
import com.saver.gym_app.repository.GiornataRepository;
import com.saver.gym_app.repository.SchedaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GiornataService {


    private final GiornataRepository repository;
    private final SchedaRepository schedaRepository;

    public List<Giornata> getGiornate(){
        return repository.findAll();
    }

    public Giornata getGiornataById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public Giornata setGiornata(GiornataDto giornataDto){
        Scheda scheda = schedaRepository.findById(giornataDto.getSchedaId())
            .orElseThrow(() -> new RuntimeException("Scheda non trovata"));
        
        Giornata giornata = new Giornata();
        giornata.setNome(giornataDto.getNome());
        giornata.setScheda(scheda);  
        
        return repository.save(giornata);
    }


}
