package com.Crestfield_Academy.Crestfield_Academy_Backend.service;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Student;
import com.Crestfield_Academy.Crestfield_Academy_Backend.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;
    public StudentDto StudentSave(StudentDto studentDto){
        studentRepo.save(modelMapper.map(studentDto, Student.class));
        return studentDto;

    }

    public List<StudentDto> getAllStudents(){
        List<Student>studentList=studentRepo.findAll();
        return modelMapper.map(studentList,new TypeToken<List<StudentDto>>(){}.getType());
    }

    public StudentDto updateStudent(StudentDto studentDto){
        studentRepo.save(modelMapper.map(studentDto,Student.class));
        return studentDto;
    }

    public  boolean deleteStudent(StudentDto studentDto){
        if(studentDto!=null){
            studentRepo.delete(modelMapper.map(studentDto,Student.class));
            return true;
        }
        else{
            return false;
        }
    }

    public StudentDto getStudentById(int id){
        Student student = studentRepo.getStudentsById(id);
        return modelMapper.map(student,StudentDto.class);
    }

    public String login(String email, String password) {
        if (email == null || password == null) {
            throw new RuntimeException("Email or password is missing.");
        }

        Student student = studentRepo.findByEmail(email);

        if (student == null) {
            throw new RuntimeException("No account found with the given email.");
        }

        if (student.getPassword().equals(password)) {
            return "Login successful!";
        } else {
            throw new RuntimeException("Incorrect password.");
        }
    }

}
