package com.project.rentacar.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Car {

    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Id
    private Long id;
    @ManyToOne
    private CarModel carModel;
    private String registrationPlate;
    private String manufacturer;
    private String model;
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Car() {
    }

    public Car(String registrationPlate, String manufacturer, String model, String color) {
        this.registrationPlate = registrationPlate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public Car(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }
}
