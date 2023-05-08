package ru.ekz48.itlc.task.carscontrol.entities.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "stations")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
