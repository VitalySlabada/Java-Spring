package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    //inject car interface

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("bmw", "m5");
        Car c2 = new Car("bmw", "x5");
        Car c3 = new Car("bmw", "740");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }



    //save these object to database


}
