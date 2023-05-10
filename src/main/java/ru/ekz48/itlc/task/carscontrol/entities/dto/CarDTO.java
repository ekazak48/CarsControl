package ru.ekz48.itlc.task.carscontrol.entities.dto;

public class CarDTO {
    private Long id;
    private String cargocode;
    private Integer cargoWeight;
    private Long trainId;

    public CarDTO() {
    }

    public CarDTO(Long id, String cargocode, Integer cargoWeight, Long trainId) {
        this.id = id;
        this.cargocode = cargocode;
        this.cargoWeight = cargoWeight;
        this.trainId = trainId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargocode() {
        return cargocode;
    }

    public void setCargocode(String cargocode) {
        this.cargocode = cargocode;
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }
}
