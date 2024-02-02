package com.example.University.controller;

import com.example.University.service.QualificationService;
import com.example.University.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualification")
public class QualificationController {
    QualificationService qualificationService;
    StudentService studentService;

    public QualificationController(QualificationService qualificationService, StudentService studentService) {
        this.qualificationService = qualificationService;
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String getQualificationByStudentId(@PathVariable Integer id) {
        return studentService.getStudentById(id).getName() + " - " + qualificationService.getQualificationByStudentId(id).toString();
    }

    @GetMapping("/orderdesc")
    public String getQualificationsByOrder() {
        return qualificationService.getQualificationsByOrder().toString();
    }
}
