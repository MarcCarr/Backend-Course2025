package fi.haagahelia.homework2carr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ageNameController {

    @GetMapping("/hello")
    public String ageNameGreeting(@RequestParam String name, @RequestParam Integer age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "agename";
    }

}
