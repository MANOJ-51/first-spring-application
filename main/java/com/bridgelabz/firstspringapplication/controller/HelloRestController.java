package com.bridgelabz.firstspringapplication.controller;

import com.bridgelabz.firstspringapplication.dto.UserData;
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

    //uc :3 pass name as path variable  //http://localhost:8080/hello/passName/sai
    @GetMapping("passName/{name}")
    public String passName(@PathVariable String name) {
        return name;
    }

    //uc :4 create dto userData with firstName and lastName
    //use post request method and pass firstName and lastName inside the body
    //http://localhost:8080/hello/addUser
    @PostMapping("addUser")
    public String addUser(@RequestBody UserData user) {
        return user.toString();
    }
}
