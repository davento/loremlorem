package pl.akademiakodu.loremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/loremIpsum")
    public String getLoremIpsum() {
        return "loremIpsum";
    }

}
