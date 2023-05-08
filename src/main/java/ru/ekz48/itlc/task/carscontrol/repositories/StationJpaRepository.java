package ru.ekz48.itlc.task.carscontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ekz48.itlc.task.carscontrol.entities.db.Station;

public interface StationJpaRepository extends JpaRepository<Station, Long> {
}
