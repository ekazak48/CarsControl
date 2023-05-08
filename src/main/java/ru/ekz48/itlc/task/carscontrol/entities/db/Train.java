package ru.ekz48.itlc.task.carscontrol.entities.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import java.util.LinkedList;
import java.util.Set;


@Entity(name = "train_formation")
public class Train {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "id")
    private LinkedList<Car> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<Car> getCars() {
        return cars;
    }

    public void setCars(LinkedList<Car> cars) {
        this.cars = cars;
    }
}
