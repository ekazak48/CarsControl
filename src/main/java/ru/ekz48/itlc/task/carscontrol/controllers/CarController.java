package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.Car;
import ru.ekz48.itlc.task.carscontrol.services.CarService;

import java.util.List;

@RestController
@Tag(name = "Вагоны", description = "Контроллер для управления данными по вагонам")
@RequestMapping("/car")
public class CarController {
    CarService carService;

    public CarController(@Autowired CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCar")
    public Car getCar(@RequestParam(name = "id") Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/getAll")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping("/new")
    public Object addCar(Car car){
        car.setId(0L);
        return car;
    }


}
