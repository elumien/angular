package com.project.rentacar.controller;

import com.project.rentacar.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String cars(Model model){
        model.addAttribute("pageTitle", "Car List");
        model.addAttribute("cars", getCars());
        return  "cars";
    }

    private ArrayList<Car> getCars(){

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("AAA-000", "Ferrari", "599 GTO", "red");
        Car car2 = new Car("BBB-111", "Ford", "Focus", "grey");
        Car car3 = new Car ("CCC-333", "Audi", "A5", "black");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }
}