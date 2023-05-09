package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.CargoType;
import ru.ekz48.itlc.task.carscontrol.services.CargoTypeService;

import java.util.List;

@RestController
@Tag(name = "Номенклатура грузов", description = "Управление словарём номенклатур грузов")
@RequestMapping("/cargoType")
public class CargoTypeController {

    CargoTypeService cargoTypeService;

    public CargoTypeController(@Autowired CargoTypeService cargoTypeService) {
        this.cargoTypeService = cargoTypeService;
    }

    @PostMapping("/add")
    public CargoType addCargoType(@RequestBody CargoType cargoType) {
        return cargoType;
    }

    @GetMapping("/getAll")
    public List<CargoType> getAll() {
        return null;
    }

    /**
     * Получение номенклатуры по id
     * @param id - id в базе данных
     * @return номенклатура
     */
    @GetMapping("/get/{id}")
    public CargoType getById(@PathVariable String id) {
        return null;
    }

    @GetMapping("/get")
    public CargoType getByCode(@RequestParam(name = "code") String code){
        return null;
    }

    @PostMapping("/update")
    public CargoType update(@RequestParam(name = "id") Long id, @RequestBody CargoType cargoType) {
        return cargoType;
    }

    @DeleteMapping(name = "/del")
    public ResponseEntity delete(@RequestParam(name = "id") Long id) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
