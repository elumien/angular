package com.project.rentacar.domain;

import lombok.*;

import javax.persistence.Entity;

//@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String registrationPlate;
    private String manufacturer;
    private String model;
    private String color;

}
