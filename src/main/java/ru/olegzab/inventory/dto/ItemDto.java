package ru.olegzab.inventory.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import ru.olegzab.inventory.model.BrandModel;
import ru.olegzab.inventory.model.Category;
import ru.olegzab.inventory.model.Location;
import ru.olegzab.inventory.model.User;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class ItemDto {
    private Long id;

    private String serialNumber;

    private String inventoryNumber;

    private BrandModel brandModel;

    private List<Category> categories;

    private String info;

    private Location location;

    private User user;

    private LocalDate startDate;


}
