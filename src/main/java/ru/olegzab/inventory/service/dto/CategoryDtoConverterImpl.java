package ru.olegzab.inventory.service.dto;

import ru.olegzab.inventory.dto.CategoryDto;
import ru.olegzab.inventory.model.Category;

public class CategoryDtoConverterImpl implements CategoryDtoConverter {
    @Override
    public CategoryDto modelToDto(Category category) {
        return new CategoryDto(category.getId(), category.getName());
    }

    @Override
    public Category dtoToModel(CategoryDto categoryDto) {
        return new Category(categoryDto.getId(), categoryDto.getName());
    }
}
