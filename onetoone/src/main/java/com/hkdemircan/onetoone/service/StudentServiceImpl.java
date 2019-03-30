package com.hkdemircan.onetoone.service;

import com.hkdemircan.onetoone.model.Student;
import com.hkdemircan.onetoone.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student findFirstStudent(int id) {
        return studentRepository.findFirstById(id);
    }
}
