package ru.olegzab.inventory.service;

import org.springframework.stereotype.Service;
import ru.olegzab.inventory.dto.AddressDto;

import java.util.List;

@Service
public interface AddressService {
    AddressDto getAddressById(Long id);
    List<AddressDto> findAll();
    void saveItem(AddressDto addressDto);
//    void updateItem(AddressDto addressDto);
//    void deleteItem(AddressDto addressDto);
}
