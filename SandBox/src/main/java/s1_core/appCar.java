package s1_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appCar {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(configCar.class);
        ElectricCar e1 = container.getBean(ElectricCar.class);

        GasCar g1 = container.getBean(GasCar.class);

        g1.createCar();
        e1.createCar();


    }

}
