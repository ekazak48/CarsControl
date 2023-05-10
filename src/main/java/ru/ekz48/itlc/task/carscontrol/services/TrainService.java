package ru.ekz48.itlc.task.carscontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.itlc.task.carscontrol.entities.db.Train;
import ru.ekz48.itlc.task.carscontrol.repositories.TrainJPARepository;

@Service
public class TrainService {

    TrainJPARepository trainJPARepository;

    TrainService(@Autowired TrainJPARepository trainJPARepository) {
        this.trainJPARepository = trainJPARepository;
    }

    public Train getById(Long id) {
        return trainJPARepository.getReferenceById(id);
    }
}
