package ru.olegzab.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.olegzab.inventory.model.Location;

public interface LocationRepo extends JpaRepository<Location, Long> {
}
