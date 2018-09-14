package com.project.rentacar.service;

import com.project.rentacar.domain.Car;
import com.project.rentacar.repository.CarRepository;
import com.project.rentacar.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;
    private CarTypeRepository carTypeRepository;

    @Autowired
    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired
    public void setCarTypeRepository(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car getCarByRegistrationPlate(String registrationPlate) {
        return carRepository.findByRegistrationPlate(registrationPlate);
    }



}
