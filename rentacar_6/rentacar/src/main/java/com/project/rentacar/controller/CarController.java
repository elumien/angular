package com.project.rentacar.controller;

import com.project.rentacar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/")
    public String cars(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

    @RequestMapping("/car/{registartionPlate}")
    public String openCarSpecs(@PathVariable(value = "registartionPlate") String id, Model model) throws Exception {
        if (id == null)
            throw new Exception("No car available with that registration plate!");
        model.addAttribute("car", carService.getCarByRegistrationPlate(id));
        return "car";
    }
}
