package ru.ekz48.itlc.task.carscontrol.entities.db;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "train_car")
@Tag(name = "Вагон")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cargo_type")
    private String cargoType;

    @Column(name = "cargo_weight")
    private Integer cargoWeight;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    public Car() {
    }

    public Car(Long id, String cargoType, Integer cargoWeight, Train train) {
        this.id = id;
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
