package com.veselov.alex.springmvc.controller;

import com.veselov.alex.springmvc.service.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserValidationService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handlePost(@RequestParam String name, @RequestParam String password, ModelMap model) {
        String view = "welcome";
        if (service.isUserValid(name, password)) {
            model.put("name", name);
        } else {
            model.put("badCreds", "Bad Creds. Try others.");
            view = "login";
        }
        return view;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
}
