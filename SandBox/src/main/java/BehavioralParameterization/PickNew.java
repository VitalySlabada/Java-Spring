package BehavioralParameterization;

import data.Car;

public class PickNew implements filterInterface{
    @Override
    public boolean pickCar(Car car) {
        return car.getYear()>2010;
    }
}
