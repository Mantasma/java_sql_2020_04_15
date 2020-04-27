package com.kcs.students.app.controller;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudent();

    }
}
