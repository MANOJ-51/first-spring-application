package com.bridgelabz.firstspringapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    //uc :1 display hello message //http://localhost:8080/hello/home
    @GetMapping("home")
    public String sayHello() {
        return "Hello Manoj";
    }

    //uc2 :2 display name  //http://localhost:8080/hello/name?name=manoj
    @GetMapping("name")
    public String displayName(@RequestParam String name) {
        return "Hello " + name;
    }

}
