package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dataClass {
    public static List<Car> getCarData() {
        return new ArrayList<>(Arrays.asList(
                new Car("bmw", Color.BLUE, 2010),
                new Car("subaru", Color.BLUE, 2020),
                new Car("renault", Color.RED, 1996),
                new Car("vw", Color.WHITE, 1998),
                new Car("subaru", Color.RED, 2005),
                new Car("renault", Color.RED, 2018),
                new Car("audi", Color.WHITE, 2016)
        ));
    }
}
