package ru.olegzab.inventory.service;

import org.springframework.stereotype.Service;
import ru.olegzab.inventory.dto.AddressDto;

import java.util.List;

@Service
public interface AddressService {
    AddressDto getAddressById(Long id);
    List<AddressDto> findAll();
    void saveAddress(AddressDto addressDto);
    void deleteAddressById(Long id);
    void update(Long addressId, AddressDto addressDto);
}
