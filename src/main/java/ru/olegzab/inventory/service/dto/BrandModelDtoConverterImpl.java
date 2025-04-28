package ru.olegzab.inventory.service.dto;

import ru.olegzab.inventory.dto.BrandModelDto;
import ru.olegzab.inventory.model.BrandModel;

import java.util.List;

public class BrandModelDtoConverterImpl implements BrandModelDtoConverter {
    @Override
    public BrandModelDto modelToDto(BrandModel brandModel) {
        return new BrandModelDto(
                brandModel.getId(),
                String.join("; ", List.of(
                        brandModel.getManufacturer(),
                        brandModel.getModelName(),
                        brandModel.getYearOfProduction())));
    }

    @Override
    public BrandModel dtoToModel(BrandModelDto brandModelDto) {
        return new BrandModel(brandModelDto.getId(), null, null, null, null) ;
    }
}
