package com.saver.gym_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saver.gym_app.entity.GiornataEsercizio;

@Repository
public interface GiornataEsercizioRepository extends JpaRepository<GiornataEsercizio, Long>{

}
