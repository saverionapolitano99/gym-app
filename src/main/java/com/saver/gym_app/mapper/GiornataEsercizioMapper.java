package com.saver.gym_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.saver.gym_app.dto.giornataesercizio.CreaGiornataEsercizioRequest;
import com.saver.gym_app.dto.giornataesercizio.GiornataEsercizioResponse;
import com.saver.gym_app.entity.GiornataEsercizio;


@Mapper(componentModel = "spring")
public interface GiornataEsercizioMapper {

     // Entity → Response
    @Mapping(source = "giornata.id", target = "giornataId")
    @Mapping(source = "giornata.nome", target = "giornataName")
    @Mapping(source = "esercizio.id", target = "esercizioId")
    @Mapping(source = "esercizio.nome", target = "esercizioNome")
    GiornataEsercizioResponse toResponse(GiornataEsercizio entity);

    

}
