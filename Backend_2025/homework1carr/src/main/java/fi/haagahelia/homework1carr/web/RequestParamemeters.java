package fi.haagahelia.homework1carr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RequestParamemeters {

    @RequestMapping("/hello")
    public String hello(@RequestParam("location") String location,
            @RequestParam("name") String name) {
        return "Welcome to the " + location + " " + name;
    }

}
