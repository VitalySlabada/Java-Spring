package practice6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dirtbike")
public class DirtbikeController {

    @RequestMapping ("/welcome")
    public String showDirtbike(){

        return ("/dirtbike/welcome");
    }



}
