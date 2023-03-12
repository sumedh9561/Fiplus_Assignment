package com.fiplus.service;

import java.util.List;

import com.fiplus.Entity.Car;

public interface CarService {

    List<Car> getAllCars();

   public Car getCarById(Long id);

   public Car addCar(Car car);

   public Car updateCar(Long id, Car car);

   public void deleteCar(Long id);
}
