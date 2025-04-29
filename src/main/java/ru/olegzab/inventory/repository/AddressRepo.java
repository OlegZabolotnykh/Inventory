package ru.olegzab.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.olegzab.inventory.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
