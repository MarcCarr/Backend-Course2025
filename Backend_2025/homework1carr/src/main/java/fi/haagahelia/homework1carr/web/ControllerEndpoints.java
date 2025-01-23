package fi.haagahelia.homework1carr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring web MVC controller
@ResponseBody // Return value annotation
public class ControllerEndpoints {
    @RequestMapping("/index") // maps url to port/keyword
    public String index() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "This is the contact page";
    }

}
