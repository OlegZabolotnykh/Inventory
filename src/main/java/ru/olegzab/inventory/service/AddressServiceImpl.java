package ru.olegzab.inventory.service;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.olegzab.inventory.dto.AddressDto;
import ru.olegzab.inventory.dto.converter.AddressDtoConverter;
import ru.olegzab.inventory.repository.AddressRepo;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressDtoConverter addressDtoConverter;

    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressDtoConverter addressDtoConverter, AddressRepo addressRepo) {
        this.addressDtoConverter = addressDtoConverter;
        this.addressRepo = addressRepo;
    }

    @Override
    public AddressDto getAddressById(Long id) {
        return addressDtoConverter.modelToDto(addressRepo.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Address with id %s not found".formatted(id)))
        );
    }

    @Override
    public List<AddressDto> findAll() {
        return addressDtoConverter.modelListToDtoList(addressRepo.findAll());
    }

    @Override
    public void saveItem(AddressDto addressDto) {
        addressRepo.save(addressDtoConverter.dtoToModel(addressDto));
    }
}
//    List<AddressDto> findAll();
//    void saveItem(AddressDto addressDto);
//    void updateItem(AddressDto addressDto);
//    void deleteItem(AddressDto addressDto);
//}
