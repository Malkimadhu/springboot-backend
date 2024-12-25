package com.Crestfield_Academy.Crestfield_Academy_Backend.Controller;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.TeacherDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.service.StudentService;
import com.Crestfield_Academy.Crestfield_Academy_Backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("api/v1/teachers")
@RestController
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping(value = "/saveTeacher")
    public TeacherDto saveTeacher(@RequestBody TeacherDto teacherDto){
        return teacherService.TeacherSave(teacherDto);
    }

    @GetMapping(value = "/getTeachers")
    public List<TeacherDto> getTeachers(){
        return teacherService.getAllTeachers();
    }

    @PutMapping(value = "/updateTeacher")
    public TeacherDto updateTeacher(@RequestBody TeacherDto teacherDto){
        return teacherService.updateTeacher(teacherDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("email");
        String password = loginData.get("password");
        return teacherService.login(email, password);
    }
}
