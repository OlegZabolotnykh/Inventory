package ru.olegzab.inventory.service.dto;

import ru.olegzab.inventory.dto.BrandModelDto;
import ru.olegzab.inventory.model.BrandModel;

public interface BrandModelDtoConverter {
    BrandModelDto modelToDto(BrandModel brandModel);

    BrandModel dtoToModel(BrandModelDto brandModelDto);
}
