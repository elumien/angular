package com.project.rentacar.repository;

import com.project.rentacar.domain.CarType;
import com.project.rentacar.domain.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {


}

