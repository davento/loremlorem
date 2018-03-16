package pl.akademiakodu.loremIpsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.loremIpsum.model.Paragraph;
import pl.akademiakodu.loremIpsum.model.Sentence;
import pl.akademiakodu.loremIpsum.model.Word;

@Controller
public class HomeController {

    @GetMapping("/print")
    public String print(@RequestParam String options,@RequestParam int count, ModelMap map) {
        if(options.equals("sentences")){
            map.put("list", new Sentence("a").generate(count));
        }
        if(options.equals("paragraph")){
            map.put("list", new Paragraph("a").generate(count));
        }
        if(options.equals("words")){
            map.put("list", new Word("a").generate(count));
        }
        return "print";
    }

    @GetMapping("/")
    public String form() {
        return "form";
    }
}

