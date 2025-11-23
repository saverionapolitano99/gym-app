package com.saver.gym_app.dto;

import lombok.Data;

@Data
public class CreaGiornataEsercizioRequest {
    
    private Long giornataId;
    private Long esercizioId;
    private Short serie;
    private Short ripetizioni;
    private Double recupero;
    private Integer ordine;
    private Double pesoTarget;
}