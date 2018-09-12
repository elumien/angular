package com.project.rentacar.controller;

import com.project.rentacar.domain.*;
import com.project.rentacar.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CarRepository carRepository;

    @RequestMapping("/")
    public String cars(Model model){
        model.addAttribute("cars", getCars());
        return  "cars";
    }

 /*   @RequestMapping("/car/{id}")
    public String searchForUser(@PathVariable(value = "id") String id, Model model) throws Exception {
        if (id == null)
            throw new Exception("No car found!");
        return "car";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest rA, Exception ex, Model model) {
        model.addAttribute("errMessage", ex.getMessage());
        return "exceptionHandler";
    }*/

    private List<Car> getCars(){

        List<Car> cars = carRepository.findAll();

        /*ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("AAA-000", "Ferrari", "599 GTO", "red");
        Car car2 = new Car("BBB-111", "Ford", "Focus", "grey");
        Car car3 = new Car ("CCC-333", "Audi", "A5", "black");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);*/

        return cars;
    }
}