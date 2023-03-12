package com.fiplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiplus.Entity.Car;
import com.fiplus.Repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Long id, Car car) {
        Car existingCar = carRepository.findById(id).orElse(null);
        if (existingCar != null) {
            car.setId(id);
            return carRepository.save(car);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCar(Long id) {
        Car existingCar = carRepository.findById(id).orElse(null);
        if (existingCar != null) {
            carRepository.delete(existingCar);
        }
    }
}
