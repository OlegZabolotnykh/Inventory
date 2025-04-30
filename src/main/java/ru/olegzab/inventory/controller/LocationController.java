package ru.olegzab.inventory.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.olegzab.inventory.service.LocationService;

@Controller
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public String getAllLocations(Model model) {
        model.addAttribute("locations", locationService.findAll());
        return "locations";
    }


    @GetMapping("{locationId:\\d+}")
    public String getLocationInfo(@PathVariable Long locationId, Model model) {
        model.addAttribute("location", locationService.getLocationById(locationId));
        return "location";
    }
}