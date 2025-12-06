package com.saver.gym_app.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.saver.gym_app.dto.giornata.GiornataDto;
import com.saver.gym_app.dto.giornata.GiornataRequest;
import com.saver.gym_app.dto.giornata.GiornataResponse;
import com.saver.gym_app.entity.Giornata;

@Mapper(componentModel = "spring")
public interface GiornataMapper {

    @Mapping(target="schedaId", source = "scheda.id")
    GiornataResponse toResponse(Giornata entity);

    GiornataDto toFilter(GiornataRequest request);
}
