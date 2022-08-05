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
    //post - body - raw - json : http://localhost:8080/hello/addUser
    @PostMapping("addUser")
    public String addUser(@RequestBody UserData user) {
        return user.toString();
    }

    //http://localhost:8080/hello/addUserParam?firstName=Manoj&lastName=Kumar
    @PostMapping("addUserParam")
    public String addUserParam(@RequestParam String firstName, @RequestParam String lastName) {
        UserData user = new UserData();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

    //uc :5 use put request method and pass firstName as path variable
    //put - http://localhost:8080/hello/updateUser?firstName=sai
    @PutMapping("updateUser")
    public String updateUser(@RequestParam String firstName) {
        UserData user = new UserData();
        user.setFirstName("Manoj");
        user.setLastName("kumar");
        user.setFirstName(firstName);
        return user.toString();
    }
}
