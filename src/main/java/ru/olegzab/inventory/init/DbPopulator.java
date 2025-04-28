package ru.olegzab.inventory.init;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.model.*;
import ru.olegzab.inventory.service.ItemService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class DbPopulator {
    private final ItemService itemService;

    public DbPopulator(ItemService itemService) {this.itemService = itemService;}

    @PostConstruct
    public void populate() {
        Address address = Address.builder()
                .name("Gipronickel")
                .addressStr("Monchegorsk, Metallurgov street, 1a")
                .build();

        Location location = Location.builder()
                .name("Склад Гипроникель")
                .address(address)
                .room("314")
                .build();

        User user = User.builder()
                .name("Miroslava")
                .lastname("Zabby")
                .department("IT")
                .position("SysAdmin")
                .phone("99-99")
                .email("miroslava@olegzab.ru")
                .build();

        BrandModel brandModel = BrandModel.builder()
                .manufacturer("Dell")
                .yearOfProduction("2022")
                .modelName("S2722QC")
                .info("27-inch 4K UHD (3840 x 2160) Monitor, 60Hz, 8MS (Normal Mode), AMD FreeSync, 99% sRGB, Built-in Dual Integrated Speakers, 1.07 Billion Colors, 2x HDMI, 2x USB 3.2, USB C, Platinum Silver")
                .build();

        Category category1 = Category.builder()
                .name("Computer Stuff")
                .build();

        Category category2 = Category.builder()
                .name("Monitors")
                .build();

        Item item = Item.builder()
                .inventoryNumber("КФ00001")
                .serialNumber("S4380430374-2345-2345")
                .categories(List.of(category1, category2))
                .location(location)
                .user(user)
                .brandModel(brandModel)
                .startDate(LocalDate.of(2023, 3, 18))
                .info("Монитор")
                .build();

        itemService.saveItem(item);
    }
}
