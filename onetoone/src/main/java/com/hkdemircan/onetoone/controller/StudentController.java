package com.hkdemircan.onetoone.controller;

import com.hkdemircan.onetoone.model.Student;
import com.hkdemircan.onetoone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getFirstStudentId(@PathVariable("id") int id){
        return studentService.findFirstStudent(id);
    }
}
