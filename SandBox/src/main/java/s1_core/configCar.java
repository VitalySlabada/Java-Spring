package s1_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configCar {
    @Bean
    GasCar gc (){return  new GasCar();};

    @Bean
    ElectricCar ec(){
        return new ElectricCar();
    }



}
