package com.Crestfield_Academy.Crestfield_Academy_Backend.service;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.TeacherDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Student;
import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Teacher;
import com.Crestfield_Academy.Crestfield_Academy_Backend.repo.TeacherRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private ModelMapper modelMapper;
    public TeacherDto TeacherSave(TeacherDto teacherDto){
        teacherRepo.save(modelMapper.map(teacherDto, Teacher.class));
        return teacherDto;
    }

    public List<TeacherDto> getAllTeachers(){
        List<Teacher>teacherList=teacherRepo.findAll();
        return modelMapper.map(teacherList,new TypeToken<List<TeacherDto>>(){}.getType());
    }

    public TeacherDto updateTeacher(TeacherDto teacherDto){
        teacherRepo.save(modelMapper.map(teacherDto,Teacher.class));
        return teacherDto;
    }

    public String login(String email, String password) {
        if (email == null || password == null) {
            throw new RuntimeException("Email or password is missing.");
        }

        Teacher teacher = teacherRepo.findTeacherByEmail(email);

        if (teacher == null) {
            throw new RuntimeException("No account found with the given email.");
        }

        if (teacher.getPassword().equals(password)) {
            return "Login successful!";
        } else {
            throw new RuntimeException("Incorrect password.");
        }
    }
}
