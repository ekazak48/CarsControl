package ru.ekz48.itlc.task.carscontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.itlc.task.carscontrol.entities.db.Car;
import ru.ekz48.itlc.task.carscontrol.repositories.CarJPARepository;

import java.util.List;

@Service
public class CarService {

    CarJPARepository carRepository;

    public CarService(@Autowired CarJPARepository carJPARepository) {
        this.carRepository = carJPARepository;
    }

    public void modify(Car car) {
        carRepository.save(car);
    }

    public Car getCarById(Long id){
        return carRepository.getCarById(id);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }



}
