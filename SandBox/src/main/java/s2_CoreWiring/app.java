package s2_CoreWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);


        System.out.println(container.getBean(Person.class).getCar());

    }
}
