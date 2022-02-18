package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext  container = new AnnotationConfigApplicationContext(Config.class);
        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);
        System.out.println("persons name: "+p.getName());
        System.out.println("cars make: "+c.getMake());
        System.out.println("persons car :" +p.getCar().getMake());



    }
}
