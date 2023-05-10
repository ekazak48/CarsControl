package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.Car;
import ru.ekz48.itlc.task.carscontrol.entities.dto.CarDTO;
import ru.ekz48.itlc.task.carscontrol.services.CarService;
import ru.ekz48.itlc.task.carscontrol.services.CargoTypeService;
import ru.ekz48.itlc.task.carscontrol.services.TrainService;

import java.util.List;

@RestController
@Tag(name = "Вагоны", description = "Управление данными по вагонам")
@RequestMapping("/car")
public class CarController {
    CarService carService;
    CargoTypeService cargoTypeService;
    TrainService trainService;

    public CarController(
            @Autowired CarService carService,
            @Autowired CargoTypeService cargoTypeService,
            @Autowired TrainService trainService) {
        this.carService = carService;
        this.cargoTypeService = cargoTypeService;
        this.trainService = trainService;
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
    public Object addCar(@RequestBody CarDTO carDto){
        Car car = convertFromDTO(carDto);
        car = carService.modify(car);
        return convertToDTO(car);
    }

    @PostMapping("/addCars")
    public Object addCars(@RequestBody List<CarDTO> cars) {



        return cars;
    }

    private Car convertFromDTO(CarDTO carDTO) {
        return new Car(
                carDTO.getId(),
                cargoTypeService.getByCode(carDTO.getCargocode()),
                carDTO.getCargoWeight(),
                trainService.getById(carDTO.getTrainId())
        );
    }

    private CarDTO convertToDTO(Car car) {
        return new CarDTO(
                car.getId(),
                car.getCargoType().getCode(),
                car.getCargoWeight(),
                car.getTrain().getId()
        );
    }

}
