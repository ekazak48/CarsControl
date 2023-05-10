package ru.ekz48.itlc.task.carscontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.itlc.task.carscontrol.entities.db.CargoType;
import ru.ekz48.itlc.task.carscontrol.repositories.CargoTypeJPARepository;

@Service
public class CargoTypeService {
    CargoTypeJPARepository cargoTypeJPARepository;

    CargoTypeService(@Autowired CargoTypeJPARepository cargoTypeJPARepository) {
        this.cargoTypeJPARepository = cargoTypeJPARepository;
    }

    public CargoType getByCode(String code) {
        return cargoTypeJPARepository.findByCode(code);
    }

}
