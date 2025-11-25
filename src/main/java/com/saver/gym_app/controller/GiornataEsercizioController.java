package com.saver.gym_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saver.gym_app.dto.CreaGiornataEsercizioRequest;
import com.saver.gym_app.dto.GiornataEsercizioResponse;
import com.saver.gym_app.service.GiornataEsercizioService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
@RequestMapping("/api/giornate-esercizi")
public class GiornataEsercizioController {
    private final GiornataEsercizioService service;

   /*  @PostMapping()
    public GiornataEsercizioResponse create(@RequestBody CreaGiornataEsercizioRequest entity) {
        
        
    }
    */

}
