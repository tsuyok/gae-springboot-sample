package sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {
    @RequestMapping(value = {""})
    public String topPage(Model model) {
        return "index";
    }
}