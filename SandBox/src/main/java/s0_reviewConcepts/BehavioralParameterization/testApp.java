package s0_reviewConcepts.BehavioralParameterization;

import data.Car;
import data.dataClass;

import java.util.ArrayList;

public class testApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = (ArrayList<Car>) dataClass.getCarData();

        //pick white
        System.out.println("white: ");
        filterM (cars,new PickWhite());
        //pick new
        System.out.println("new: ");
        filterM(cars, new PickNew());


    }

    private static void filterM(ArrayList<Car> cars, filterInterface f) {
        for (Car each: cars){
            if (f.pickCar(each)) System.out.println(each);
        }
    }

}
