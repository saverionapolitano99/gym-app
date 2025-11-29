package com.saver.gym_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.saver.gym_app.dto.giornata.GiornataResponse;
import com.saver.gym_app.entity.Giornata;

@Mapper(componentModel = "spring")
public interface GiornataMapper {

    @Mapping(target="schedaId", source = "scheda.id")
    GiornataResponse toResponse(Giornata entity);
}
