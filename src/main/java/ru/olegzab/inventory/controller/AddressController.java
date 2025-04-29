package ru.olegzab.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.olegzab.inventory.dto.AddressDto;
import ru.olegzab.inventory.service.AddressService;

@Controller
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("all")
    public String getAllAddresses(Model model) {
        model.addAttribute("addresses", addressService.findAll());
        return "addresses";
    }

    @GetMapping("{addressId:\\d+}")
    public String getAddressInfo(@PathVariable Long addressId, Model model) {
        model.addAttribute("address", addressService.getAddressById(addressId));
        return "address";
    }

    @GetMapping("new")
    public String addNewAddress(Model model) {
        model.addAttribute("newAddressDto", new AddressDto());
        return "new_address";
    }

    @PostMapping("new")
    public String addNewAddress(@ModelAttribute AddressDto newAddressDto, Model model) {
        addressService.saveItem(newAddressDto);
        return "redirect:/addresses/all";
    }
}
