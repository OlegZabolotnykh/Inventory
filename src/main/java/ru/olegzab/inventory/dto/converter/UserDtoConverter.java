package ru.olegzab.inventory.dto.converter;

import ru.olegzab.inventory.dto.UserDto;
import ru.olegzab.inventory.model.User;

public interface UserDtoConverter {
    UserDto convertToDto(User user);
    User convertToModel(UserDto userDto);
}
