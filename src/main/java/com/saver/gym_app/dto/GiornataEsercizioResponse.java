package com.saver.gym_app.dto;

import lombok.Data;

@Data
public class GiornataEsercizioResponse {
    
    private Long id;
    
    // Dati Giornata
    private Long giornataId;
    private String giornataName;
    
    // Dati Esercizio
    private Long esercizioId;
    private String esercizioNome;
    
    // Dati specifici
    private Short serie;
    private Short ripetizioni;
    private Double recupero;
    private Integer ordine;
    private Double pesoTarget;
}
