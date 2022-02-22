package s1_core.Stereotyping;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class BikeStreet {
    public void getStreetBike (){
        System.out.println("got street bike");
    }
}
