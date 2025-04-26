package ru.olegzab.inventory.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import ru.olegzab.inventory.model.Item;
import ru.olegzab.inventory.repository.ItemRepo;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    ItemRepo itemRepo;

    public ItemServiceImpl(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }


    @Override
    public Item getItemById(Long id) {
        return itemRepo.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Item with %s not found".formatted(id)));
    }

    @Override
    public List<Item> findAll() {
        return itemRepo.findAll();
    }

    @Override
    public void saveItem(Item item) {
        itemRepo.save(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepo.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        itemRepo.delete(item);
    }
}
