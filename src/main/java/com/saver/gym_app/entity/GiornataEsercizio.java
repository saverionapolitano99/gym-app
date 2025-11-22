package com.saver.gym_app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "giornate_esercizio")
@Data
public class GiornataEsercizio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Short serie;
    @Column(nullable = false)
    private Short ripetizioni;
    @Column(nullable = false)
    private Double recupero;

    @ManyToOne
    @JoinColumn(name="giornata_id", nullable=false)
    Giornata giornata;

    @ManyToOne
    @JoinColumn(name="esercizio_id", nullable=false)
    Esercizio esercizio;
}
