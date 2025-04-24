package ru.olegzab.inventory.init;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.olegzab.inventory.model.*;
import ru.olegzab.inventory.service.ItemService;

import java.time.LocalDateTime;
import java.util.List;

public class DbPopulator {
    private ItemService itemService;

    public DbPopulator(ItemService itemService) {this.itemService = itemService;}

    @PostConstruct
    public void populate() {
        Address address = Address.builder()
                .addressStr("Monchegorsk, Metallurgov street, 1a")
                .build();

        Location location = Location.builder()
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

        Category category = Category.builder()
                .name("Computer Stuff")
                .build();

        Item item = Item.builder()
                .name("Monitor")
                .categories(List.of(category))
                .description("Ultra HD Monitor Rassvet")
                .location(location)
                .user(user)
                .startDate(LocalDateTime.now().minusDays(100))
                .build();
    }
}
