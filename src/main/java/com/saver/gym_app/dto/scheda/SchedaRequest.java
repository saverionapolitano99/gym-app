package com.saver.gym_app.dto.scheda;

import java.time.LocalDate;


import lombok.Data;

@Data
public class SchedaRequest {

    private LocalDate dataInizio;

    private LocalDate dataFine;
}
