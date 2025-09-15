package ru.olegzab.inventory.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.dto.ItemDto;
import ru.olegzab.inventory.model.Item;

@Component
public class ItemDtoConverterImpl implements ItemDtoConverter {
    private final ModelMapper modelMapper;

    public ItemDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public ItemDto convertToDto(Item item) {
        return modelMapper.map(item, ItemDto.class);
    }

    @Override
    public Item convertToModel(ItemDto itemDto) {
        return modelMapper.map(itemDto, Item.class);
    }
}
