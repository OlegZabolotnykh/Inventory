package ru.olegzab.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Entity
@Table(name="items")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="serial_number", unique=true)
    private String serialNumber;

    @Column(name="inventory_number", unique = true)
    private String inventoryNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private BrandModel brandModel;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Category> categories;

    private String info;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST , CascadeType.MERGE, CascadeType.REFRESH})
    private User user;

    private LocalDate startDate;

    public String getCategoriesAsString() {
        return this.categories.stream()
                .map(Category::getName)
                .collect(Collectors.joining(", "));}

}
