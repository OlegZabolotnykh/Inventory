package ru.olegzab.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "name")
    private String name;

    @Column(name="categories")
    @ManyToMany
    private List<Category> categories;

    @Column(name="description")
    private String description;

    @OneToMany
    private List<Location> location;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private LocalDateTime startDate;

}
