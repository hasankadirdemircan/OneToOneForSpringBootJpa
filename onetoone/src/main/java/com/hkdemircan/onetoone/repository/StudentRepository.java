package com.hkdemircan.onetoone.repository;

import com.hkdemircan.onetoone.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findFirstById(int id);
}
