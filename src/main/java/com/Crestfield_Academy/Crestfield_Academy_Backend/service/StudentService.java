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
}
