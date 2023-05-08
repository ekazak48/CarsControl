package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.Station;

import java.util.List;

@RestController
@Tag(name = "Станции", description = "Управление информацией по станциям")
@RequestMapping("/stations")
public class StationsController {

    @GetMapping("/getAll")
    public List<Station> getAll(){
        return null;
    }


}
