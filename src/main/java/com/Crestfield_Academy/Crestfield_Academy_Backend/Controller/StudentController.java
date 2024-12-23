package com.Crestfield_Academy.Crestfield_Academy_Backend.Controller;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/students")
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping(value = "/getStudents")
    public List<StudentDto> getUser(){

        return studentService.getAllStudents();
    }

    @PostMapping(value = "/saveStudent")
    public StudentDto saveStudent(@RequestBody StudentDto studentDto){
        return studentService.StudentSave(studentDto);

    }

    @PutMapping(value = "/updateStudent")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto){
        return studentService.updateStudent(studentDto);

    }
}
