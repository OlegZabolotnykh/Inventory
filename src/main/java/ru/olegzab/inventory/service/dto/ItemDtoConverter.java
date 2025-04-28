package ru.olegzab.inventory.service.dto;

import ru.olegzab.inventory.dto.ItemDto;
import ru.olegzab.inventory.model.Item;

public interface ItemDtoConverter {
    ItemDto convertToDto(Item item);
    Item convertToModel(ItemDto itemDto);
}
