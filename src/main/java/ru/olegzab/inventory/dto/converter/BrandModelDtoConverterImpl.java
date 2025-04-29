package ru.olegzab.inventory.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.dto.BrandModelDto;
import ru.olegzab.inventory.model.BrandModel;

@Component
public class BrandModelDtoConverterImpl implements BrandModelDtoConverter {

    private final ModelMapper modelMapper;

    public BrandModelDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BrandModelDto modelToDto(BrandModel brandModel) {
        return modelMapper.map(brandModel, BrandModelDto.class);
    }

    @Override
    public BrandModel dtoToModel(BrandModelDto brandModelDto) {
        return modelMapper.map(brandModelDto, BrandModel.class);
    }
}
