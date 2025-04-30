package ru.olegzab.inventory.service;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.olegzab.inventory.dto.LocationDto;
import ru.olegzab.inventory.dto.converter.LocationDtoConverter;
import ru.olegzab.inventory.repository.LocationRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepo locationRepo;

    private final LocationDtoConverter locationDtoConverter;

    public LocationServiceImpl(LocationRepo locationRepo, LocationDtoConverter locationDtoConverter) {
        this.locationRepo = locationRepo;
        this.locationDtoConverter = locationDtoConverter;
    }

    @Override
    public LocationDto getLocationById(Long id) {
        return locationDtoConverter.modelToDto(locationRepo.findById(id).orElseThrow(() ->
                new EntityNotFoundException(String.format("Location with id '%d' not found", id))));
    }

    @Override
    public List<LocationDto> findAll() {
        return locationRepo.findAll().stream()
                .map(locationDtoConverter::modelToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void saveLocation(LocationDto locationDto) {

    }

    @Override
    public void deleteLocationById(Long id) {

    }

    @Override
    public void update(Long locationId, LocationDto locationDto) {

    }
}
