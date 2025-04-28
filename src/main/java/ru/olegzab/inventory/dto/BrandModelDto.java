package ru.olegzab.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BrandModelDto {
    private Long id;

    private String brandModelRepresentation;
}
