package com.Crestfield_Academy.Crestfield_Academy_Backend.repo;

import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
    @Query(value = "SELECT * FROM TEACHER WHERE EMAIL = ?1", nativeQuery = true)
    Teacher findTeacherByEmail(String email);
}
