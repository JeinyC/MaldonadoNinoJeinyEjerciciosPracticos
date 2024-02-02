package com.example.University.controller;

import com.example.University.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/student")
    public String students() {
        return " - "+ studentService.getStudents();
    }

    @GetMapping("/student/{id}")
    public String getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id).toString();
    }
}
