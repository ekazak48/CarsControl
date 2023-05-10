package ru.ekz48.itlc.task.carscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ekz48.itlc.task.carscontrol.entities.db.CargoType;

public interface CargoTypeJPARepository extends JpaRepository<CargoType, Long> {

    CargoType findByCode(String code);
}
