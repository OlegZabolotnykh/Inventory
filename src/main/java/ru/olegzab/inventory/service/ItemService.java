package ru.olegzab.inventory.service;

import ru.olegzab.inventory.dto.ItemDto;
import ru.olegzab.inventory.model.Item;

import java.util.List;

public interface ItemService {
    ItemDto getItemById(Long id);
    List<Item> findAll();
    void saveItem(Item item);
    void updateItem(Item item);
    void deleteItem(Item item);
}
