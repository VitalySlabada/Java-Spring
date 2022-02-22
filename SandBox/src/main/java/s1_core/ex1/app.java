package s1_core.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        container.getBean(BikeStreet.class).getStreetBike();

        System.out.println(container.getBean(BikeDirt.class).getName());


        System.out.println(container.getBean("ktm",BikeDirt.class).getName());

    }

}
