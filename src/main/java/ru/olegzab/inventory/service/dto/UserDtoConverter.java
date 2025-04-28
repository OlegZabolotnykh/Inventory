package ru.olegzab.inventory.service.dto;

import ru.olegzab.inventory.dto.UserDto;
import ru.olegzab.inventory.model.User;

public interface UserDtoConverter {
    UserDto convertToDto(User user);
    User convertToModel(UserDto userDto);
}
