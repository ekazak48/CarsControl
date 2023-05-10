package ru.ekz48.itlc.task.carscontrol.entities.dto;

public class CargoTypeDTO {
    String code;
    String description;

    public CargoTypeDTO() {
    }

    public CargoTypeDTO(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
