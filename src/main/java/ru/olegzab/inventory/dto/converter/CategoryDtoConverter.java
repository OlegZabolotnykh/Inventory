package ru.olegzab.inventory.dto.converter;

import ru.olegzab.inventory.dto.CategoryDto;
import ru.olegzab.inventory.model.Category;

public interface CategoryDtoConverter {
    CategoryDto modelToDto(Category brandModel);

    Category dtoToModel(CategoryDto brandModelDto);
}
