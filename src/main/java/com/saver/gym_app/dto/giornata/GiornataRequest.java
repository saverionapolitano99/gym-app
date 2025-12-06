package com.saver.gym_app.dto.giornata;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GiornataRequest {
    private String nome;

    private Long schedaId;
}
