package s1_core.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BikeDirt {
    private String name;


    public void getDirtBike (){
        System.out.println("got dirt bike");
    }


}
