package ru.olegzab.inventory.dto.converter;

import ru.olegzab.inventory.dto.LocationDto;
import ru.olegzab.inventory.model.Location;

public interface LocationDtoConverter {
    LocationDto modelToDto(Location location);

    Location modelToDto(LocationDto locationDto);
}
