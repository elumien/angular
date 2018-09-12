package com.project.rentacar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String cars(Model model){
        model.addAttribute("pageTitle", "Car List");
        return  "cars";
    }
}
