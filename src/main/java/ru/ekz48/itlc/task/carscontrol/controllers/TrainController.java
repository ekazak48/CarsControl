package ru.ekz48.itlc.task.carscontrol.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.itlc.task.carscontrol.entities.db.Train;

import java.util.ArrayList;
import java.util.List;

@RestController
@Tag(name = "Поезда", description = "Управление информацией по поездам")
@RequestMapping("/train")
public class TrainController {

    @GetMapping("/getAll")
    public List<Train> getAll() {
        return new ArrayList<>();
    }


}
