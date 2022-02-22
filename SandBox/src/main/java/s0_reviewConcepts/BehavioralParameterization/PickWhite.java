package s0_reviewConcepts.BehavioralParameterization;

import data.Car;
import data.Color;

public class PickWhite implements filterInterface {
    @Override
    public boolean pickCar(Car car) {
        return car.getColor().equals(Color.WHITE);
    }
}
