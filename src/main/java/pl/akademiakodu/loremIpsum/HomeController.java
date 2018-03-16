package pl.akademiakodu.loremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String form() {
        return "form";
    }

    @GetMapping("/print")
    public String print() {
        return "print";
    }
}