package com.saver.gym_app.mapper;

import org.mapstruct.Mapper;

import com.saver.gym_app.dto.esercizio.EsercizioRequest;
import com.saver.gym_app.dto.esercizio.EsercizioResponse;

import com.saver.gym_app.entity.Esercizio;

@Mapper(componentModel = "spring")
public interface EsercizioMapper {

        Esercizio toFilter(EsercizioRequest request);

        EsercizioResponse toResponse(Esercizio ese);


}
