package s1_core.ex1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    @Primary
    BikeDirt bikeDirt(){
        BikeDirt bik1 = new BikeDirt();
        bik1.setName("---");

        return bik1;
    }

    @Bean(name = "ktm")
    BikeDirt bikeDirt1(){
        BikeDirt bik1 = new BikeDirt();
        bik1.setName("KTM");

        return bik1;
    }




    @Bean
    BikeStreet bikeStreet(){
        return new BikeStreet();
    }


}
