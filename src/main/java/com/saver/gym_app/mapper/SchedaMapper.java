package com.saver.gym_app.mapper;

import org.mapstruct.Mapper;

import com.saver.gym_app.dto.scheda.SchedaRequest;
import com.saver.gym_app.entity.Scheda;

@Mapper(componentModel = "spring")
public interface SchedaMapper {

    Scheda toFilter(SchedaRequest request);
    
}
