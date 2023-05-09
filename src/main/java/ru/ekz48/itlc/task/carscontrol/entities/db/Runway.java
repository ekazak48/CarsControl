package ru.ekz48.itlc.task.carscontrol.entities.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "station_runways")
public class Runway {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @Column(name = "runway_id")
    private Long rwNumber;

    @Column(name = "description")
    private String description;

    public Runway() {
    }

    public Runway(Long id, Station station, Long rwNumber, String description) {
        this.id = id;
        this.station = station;
        this.rwNumber = rwNumber;
        this.description = description;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
