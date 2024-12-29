package com.Crestfield_Academy.Crestfield_Academy_Backend.repo;

import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Query(value = "SELECT * FROM STUDENT WHERE ID = ?1",nativeQuery = true)
    Student getStudentsById(int id);

    @Query(value = "SELECT * FROM STUDENT WHERE EMAIL = ?1", nativeQuery = true)
    Student findByEmail(String email);

    Student findById(int id);
}
