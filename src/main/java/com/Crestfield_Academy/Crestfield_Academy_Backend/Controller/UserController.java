package com.Crestfield_Academy.Crestfield_Academy_Backend.Controller;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/getUser")
    public String getUser(){
        return "Hi Malki";
    }

    @PostMapping(value = "/saveStudent")
    public StudentDto saveStudent(@RequestBody StudentDto studentDto){
        return studentService.StudentSave(studentDto);
    }
}
