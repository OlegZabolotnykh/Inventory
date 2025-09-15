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

    @GetMapping
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
        addressService.saveAddress(newAddressDto);
        return "redirect:/addresses";
    }

    @PostMapping("{addressId:\\d+}/delete")
    public String deleteAddress(@PathVariable Long addressId, Model model) {
        addressService.deleteAddressById(addressId);
        return "redirect:/addresses";
    }

    @GetMapping("{addressId:\\d+}/edit")
    public String getEditAddress(@PathVariable Long addressId, Model model) {
        model.addAttribute("address", addressService.getAddressById(addressId));
        return "edit_address";
    }

    @PostMapping("{addressId:\\d}/edit")
    public String postEditAddress(@PathVariable Long addressId, @ModelAttribute AddressDto address) {
        addressService.update(addressId, address);
        return "redirect:/addresses/{addressId}";
    }
}
