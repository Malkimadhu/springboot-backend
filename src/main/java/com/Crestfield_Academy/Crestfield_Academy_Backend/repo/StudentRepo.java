package com.Crestfield_Academy.Crestfield_Academy_Backend.repo;

import com.Crestfield_Academy.Crestfield_Academy_Backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
