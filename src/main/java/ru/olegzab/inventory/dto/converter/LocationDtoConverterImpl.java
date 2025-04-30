package ru.olegzab.inventory.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.dto.LocationDto;
import ru.olegzab.inventory.model.Location;

@Component
public class LocationDtoConverterImpl implements LocationDtoConverter {
    private final ModelMapper modelMapper;

    public LocationDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public LocationDto modelToDto(Location location) {
        return modelMapper.map(location, LocationDto.class);
    }

    @Override
    public Location modelToDto(LocationDto locationDto) {
        return modelMapper.map(locationDto, Location.class);
    }
}
