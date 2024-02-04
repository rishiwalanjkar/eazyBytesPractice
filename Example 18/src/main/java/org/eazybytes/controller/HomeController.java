package org.eazybytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String displayHomePage() {
        return "home.html";
    }

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello() {
        return "Hello use, welcome to eazy school!!";
    }
}
