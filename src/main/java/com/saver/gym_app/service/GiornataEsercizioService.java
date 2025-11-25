package com.saver.gym_app.service;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import com.saver.gym_app.dto.CreaGiornataEsercizioRequest;
import com.saver.gym_app.dto.GiornataEsercizioResponse;
import com.saver.gym_app.entity.Esercizio;
import com.saver.gym_app.entity.Giornata;
import com.saver.gym_app.entity.GiornataEsercizio;
import com.saver.gym_app.mapper.GiornataEsercizioMapper;
import com.saver.gym_app.repository.EsercizioRepository;
import com.saver.gym_app.repository.GiornataEsercizioRepository;
import com.saver.gym_app.repository.GiornataRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GiornataEsercizioService {

    private final GiornataEsercizioRepository repository;
    private final GiornataRepository repositoryGiornata;
    private final EsercizioRepository repositoryEsercizio;
    private final GiornataEsercizioMapper mapper;

    public GiornataEsercizioResponse creaGiornata(CreaGiornataEsercizioRequest request){
           
           Giornata giornata= repositoryGiornata.findById(request.getGiornataId()).orElseThrow();
           Esercizio esercizio = repositoryEsercizio.findById(request.getEsercizioId()).orElseThrow();
           
           GiornataEsercizio giornataEsercizio = repository.save(GiornataEsercizio.builder()
           .esercizio(esercizio)
           .giornata(giornata)
           .ripetizioni(request.getRipetizioni())
           .serie(request.getSerie())
           .pesoTarget(request.getPesoTarget())
           .ordine(request.getOrdine())
           .recupero(request.getRecupero())
           .build());

        return mapper.toResponse(giornataEsercizio);
    }
}
