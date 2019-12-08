package com.veselov.alex.jee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @GetMapping("/login")
    @ResponseBody
    public String sayHello(){
        return "Hello World";
    }
}
