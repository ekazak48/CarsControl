package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.Station;
import ru.ekz48.itlc.task.carscontrol.services.StationService;

import java.util.List;

@RestController
@Tag(name = "Станции", description = "Управление информацией по станциям")
@RequestMapping("/stations")
public class StationsController {

    StationService stationService;

    public StationsController(@Autowired StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/getAll")
    public List<Station> getAll(){
        return null;
    }

    @GetMapping("/get")
    public Station getById(@RequestParam Long id) {
        return null;
    }

    @PostMapping("/add")
    public Station addInfo(@RequestBody Station station) {
        return null;
    }

    @PostMapping("/update")
    public Station updateInfo(@RequestBody Station station) {
        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id) {
        return null;
    }


}
