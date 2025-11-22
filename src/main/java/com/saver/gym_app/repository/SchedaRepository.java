package com.saver.gym_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saver.gym_app.entity.Scheda;

@Repository
public interface SchedaRepository extends JpaRepository<Scheda, Long>{

}
