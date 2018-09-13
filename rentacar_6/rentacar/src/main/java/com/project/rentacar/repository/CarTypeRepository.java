package com.project.rentacar.repository;

import com.project.rentacar.domain.CarType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarTypeRepository extends CrudRepository<CarType, Long> {

    List<CarType> findAll();

}

