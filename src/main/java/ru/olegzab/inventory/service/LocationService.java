package ru.olegzab.inventory.service;

import org.springframework.stereotype.Service;
import ru.olegzab.inventory.dto.AddressDto;
import ru.olegzab.inventory.dto.LocationDto;

import java.util.List;

@Service
public interface LocationService {
    LocationDto getLocationById(Long id);
    List<LocationDto> findAll();
    void saveLocation(LocationDto locationDto);
    void deleteLocationById(Long id);
    void update(Long locationId, LocationDto locationDto);
}
