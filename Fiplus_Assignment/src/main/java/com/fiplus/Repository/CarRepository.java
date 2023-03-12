package com.fiplus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiplus.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}