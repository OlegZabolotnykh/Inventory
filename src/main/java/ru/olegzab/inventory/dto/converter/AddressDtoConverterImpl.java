package ru.olegzab.inventory.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.dto.AddressDto;
import ru.olegzab.inventory.model.Address;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressDtoConverterImpl implements AddressDtoConverter {
    private final ModelMapper modelMapper;

    public AddressDtoConverterImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AddressDto modelToDto(Address address) {
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    public Address dtoToModel(AddressDto addressDto) {
        return modelMapper.map(addressDto, Address.class);
    }

    @Override
    public List<AddressDto> modelListToDtoList(List<Address> addressList) {
        return addressList.stream()
                .map(address -> modelMapper.map(address, AddressDto.class))
                .toList();
    }
}
