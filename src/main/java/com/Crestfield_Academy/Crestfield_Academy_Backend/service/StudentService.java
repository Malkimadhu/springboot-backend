package com.Crestfield_Academy.Crestfield_Academy_Backend.service;

import com.Crestfield_Academy.Crestfield_Academy_Backend.dto.StudentDto;
import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Student;
import com.Crestfield_Academy.Crestfield_Academy_Backend.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
