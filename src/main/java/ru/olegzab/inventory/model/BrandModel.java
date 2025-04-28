package ru.olegzab.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="models")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;

    private String modelName;

    private String yearOfProduction;

    private String info;

    @Override
    public String toString() {
        return String.format("%s %s %s", manufacturer, modelName, yearOfProduction);
    }
}
