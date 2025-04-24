package ru.olegzab.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.olegzab.inventory.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
