package ru.olegzab.inventory.dto.converter;

import ru.olegzab.inventory.dto.ItemDto;
import ru.olegzab.inventory.model.Item;

public interface ItemDtoConverter {
    ItemDto convertToDto(Item item);
    Item convertToModel(ItemDto itemDto);
}
