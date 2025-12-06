package com.saver.gym_app.dto.giornata;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GiornataResponse {
    private Long id;
    private String nome;
    private Long schedaId;  // ← Solo l'ID, non l'oggetto completo!
}
