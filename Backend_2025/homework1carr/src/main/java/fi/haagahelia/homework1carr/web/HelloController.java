package fi.haagahelia.homework1carr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Github: https://github.com/MarcCarr

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("*")
    public String hello() {
        return "Hello Spring";
    }

}