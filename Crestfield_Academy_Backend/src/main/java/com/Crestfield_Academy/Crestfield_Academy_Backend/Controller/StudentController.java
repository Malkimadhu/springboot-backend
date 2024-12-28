package com.Crestfield_Academy.Crestfield_Academy_Backend.Controller;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/students")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping(value = "/getStudents")
    public List<StudentDto> getUser(){

        return studentService.getAllStudents();
    }

    @PostMapping(value = "/saveStudent")
    public StudentDto saveStudent(@RequestBody StudentDto studentDto){
        String pass = studentDto.getPassword();
        System.out.println(pass);
        return studentService.StudentSave(studentDto);

    }

    @PutMapping(value = "/updateStudent")
    public StudentDto updateStudent(@RequestBody StudentDto studentDto){
        return studentService.updateStudent(studentDto);

    }

    @DeleteMapping(value = "/deleteStudent")
    public boolean deleteStudent(@RequestBody StudentDto studentDto){
        return studentService.deleteStudent(studentDto);

    }

    @GetMapping("/getStudentById/{id}")
    public StudentDto getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/login")
    public StudentDto login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");
        return studentService.login(email, password);
    }

}
