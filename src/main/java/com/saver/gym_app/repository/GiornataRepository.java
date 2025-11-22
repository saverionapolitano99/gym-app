package com.saver.gym_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saver.gym_app.entity.Giornata;

@Repository
public interface GiornataRepository extends JpaRepository<Giornata, Long>{

}
