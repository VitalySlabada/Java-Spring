package s2_CoreWiring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Car car(){

        Car car = new Car();
        car.setMake("subaru");
        return car;
    }

    @Bean
    Person person (){
        Person person = new Person();
        person.setName("John");

        //WIRING
        person.setCar(car());
        return person;
    }

}
