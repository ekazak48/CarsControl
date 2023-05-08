package ru.ekz48.itlc.task.carscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ekz48.itlc.task.carscontrol.entities.db.Car;

import java.util.List;

public interface CarJPARepository extends JpaRepository<Car, Long> {
    Car getCarById(Long id);
}
