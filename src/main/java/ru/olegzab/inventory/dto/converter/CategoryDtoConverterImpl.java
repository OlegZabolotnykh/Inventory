package ru.olegzab.inventory.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.dto.CategoryDto;
import ru.olegzab.inventory.model.Category;

@Component
public class CategoryDtoConverterImpl implements CategoryDtoConverter {
    private final ModelMapper modelMapper;

    public CategoryDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDto modelToDto(Category category) {
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public Category dtoToModel(CategoryDto categoryDto) {
        return modelMapper.map(categoryDto, Category.class);
    }
}
