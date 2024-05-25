package com.class1.controller;


import com.class1.entity.Vehicle;
import com.class1.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String getAllVehicles(Model model) {
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);
        model.addAttribute("isAdmin", true); // Điều này cần thay đổi dựa trên phân quyền của người dùng
        return "vehiclesList";
    }

    @GetMapping("/{id}")
    public String getVehicleById(@PathVariable int id, Model model) {
        Optional<Vehicle> vehicle = vehicleService.findById(id);
        if (vehicle.isPresent()) {
            model.addAttribute("vehicle", vehicle.get());
            return "vehicleDetail";
        } else {
            model.addAttribute("message", "Vehicle not found");
            return "error";
        }
    }

    @PostMapping("/add")
    public String addVehicle(@RequestParam String vehicleName, @RequestParam String vehicleModel, @RequestParam int yearOfManufacture, @RequestParam String vehicleColor, Model model) {
        Vehicle vehicle = new Vehicle(0, vehicleName, vehicleModel, yearOfManufacture, vehicleColor);
        vehicleService.save(vehicle);
        model.addAttribute("message", "Vehicle added successfully");
        return "success";
    }

    @PostMapping("/update")
    public String updateVehicle(@RequestParam int vehicleId, @RequestParam String vehicleName, @RequestParam String vehicleModel, @RequestParam int yearOfManufacture, @RequestParam String vehicleColor, Model model) {
        Vehicle vehicle = new Vehicle(vehicleId, vehicleName, vehicleModel, yearOfManufacture, vehicleColor);
        vehicleService.save(vehicle);
        model.addAttribute("message", "Vehicle updated successfully");
        return "success";
    }

    @DeleteMapping("/delete")
    public String deleteVehicle(@RequestParam int vehicleId, Model model) {
        vehicleService.deleteById(vehicleId);
        model.addAttribute("message", "Vehicle deleted successfully");
        return "success";
    }
}
