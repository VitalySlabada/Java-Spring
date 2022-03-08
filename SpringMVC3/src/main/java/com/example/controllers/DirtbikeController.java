package com.example.controllers;

import com.example.controllers.dirtbikePKG.Dirtbike;
import com.example.enums.Color;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class DirtbikeController {
    @RequestMapping("/welcome")
    public String welcome(@RequestParam String str1, Model model) {


        //String str = String.valueOf(variable);
        List<Dirtbike> bikeList = new ArrayList<>();
        bikeList.add(new Dirtbike("KTM", "Austria", Color.ORANGE));
        bikeList.add(new Dirtbike("Honda", "Japan", Color.RED));
        bikeList.add(new Dirtbike("Kawasaki", "Japan", Color.GREEN));
        bikeList.add(new Dirtbike("Suzuki", "Japan", Color.YELLOW));
        bikeList.add(new Dirtbike("Gas Gas", "Spain", Color.RED));
        bikeList.add(new Dirtbike("Husqvarna", "Sweden", Color.BLUE));
        bikeList.add(new Dirtbike("Gas Gas", "Spain", Color.RED));
        bikeList.add(new Dirtbike("Beta", "Italy", Color.RED));
        bikeList.add(new Dirtbike("Yamaha", "Japan", Color.BLUE));


        Dirtbike dbike = bikeList.stream().filter(p -> p.getMake().equalsIgnoreCase(str1)).findFirst().get();

        model.addAttribute("bike", dbike);

        return "/welcome";
    }


}
