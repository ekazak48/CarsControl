package ru.ekz48.itlc.task.carscontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.itlc.task.carscontrol.repositories.StationJpaRepository;

@Service
public class StationService {
    StationJpaRepository stationJpaRepository;

    public StationService(@Autowired StationJpaRepository stationJpaRepository) {
        this.stationJpaRepository = stationJpaRepository;
    }
}
