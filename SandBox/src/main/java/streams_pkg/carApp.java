package streams_pkg;


import data.Car;
import data.Color;

import static data.dataClass.getCarData;

public class carApp {


    public static void main(String[] args) {

        getCarData().stream().map(Car::getColor)
                .filter(p -> p.equals(Color.BLUE))
                .forEach(System.out::println);



    }

}
