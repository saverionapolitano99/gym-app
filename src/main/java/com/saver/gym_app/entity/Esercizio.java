package com.saver.gym_app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "esercizi")
@Data
public class Esercizio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nome;

    @OneToMany(mappedBy="esercizio")
    @JsonIgnore
    private List<GiornataEsercizio> giornateEsercizio;
}