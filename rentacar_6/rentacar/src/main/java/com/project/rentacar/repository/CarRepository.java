package com.project.rentacar.repository;

import com.project.rentacar.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query(value = "SELECT *\n" +
            "FROM Car c\n" +
            "LEFT JOIN Rent r\n" +
            "ON c.id = r.car_id\n" +
            "WHERE (r.date_from > CURRENT_DATE()\n" +
            "AND r.date_to < CURRENT_DATE())\n" +
            "OR r.car_id is null", nativeQuery = true)
    List<Car> findAll();

    Car findByRegistrationPlate(String registrationPlate);



}

