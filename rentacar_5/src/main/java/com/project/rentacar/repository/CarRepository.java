package com.project.rentacar.repository;

import com.project.rentacar.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car,Long> {

    List<Car> findAll();
}
