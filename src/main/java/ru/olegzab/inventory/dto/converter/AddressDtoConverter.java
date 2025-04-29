package ru.olegzab.inventory.dto.converter;

import ru.olegzab.inventory.dto.AddressDto;
import ru.olegzab.inventory.model.Address;

import java.util.List;

public interface AddressDtoConverter {
    AddressDto modelToDto(Address address);

    Address dtoToModel(AddressDto addressDto);

    List<AddressDto> modelListToDtoList(List<Address> addressList);
}
