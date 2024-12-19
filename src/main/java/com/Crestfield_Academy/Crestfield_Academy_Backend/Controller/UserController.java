package com.Crestfield_Academy.Crestfield_Academy_Backend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/user")
@RestController
@CrossOrigin
public class UserController {
    
    @GetMapping(value = "/getUser")
    public String getUser(){
        return "Hi Malki";
    }
}
