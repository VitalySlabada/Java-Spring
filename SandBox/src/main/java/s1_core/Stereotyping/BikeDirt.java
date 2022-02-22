package s1_core.Stereotyping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString

@Component
public class BikeDirt {
    private String name;


    public void getDirtBike (){
        System.out.println("got dirt bike");
    }


}
