package ru.olegzab.inventory.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.olegzab.inventory.service.ItemService;

@Controller
@RequestMapping(path = "/items")
public class ItemsController {
    private final ItemService itemService;

    public ItemsController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("all")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemService.findAll());
        return "items";
    }

    @GetMapping("{itemId:\\d+}")
    public String getItem(@PathVariable Long itemId, Model model) {
        model.addAttribute("item", itemService.getItemById(itemId));
        return "item";
    }

    @GetMapping("newItem")
    public String newItemPage() {
        return "new_item";
    }

    @PostMapping("newItem")
    public void addItem(@RequestBody HttpRequest request, Model model) {

    }
}

