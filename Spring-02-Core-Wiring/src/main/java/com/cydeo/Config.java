package com.cydeo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{


    @Bean
    Car makeCar(){

        Car c = new Car();
        c.setMake("honda");
        return c;
    }
    //Direct wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("bob");
//        p.setCar(makeCar());
//        return p;
//    }

    //Autowiring
        @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("bob");
        p.setCar(car);
        return p;
    }



}
