package com.example.University.service;

import com.example.University.DTO.StudentDTO;
import com.example.University.model.Qualification;
import com.example.University.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class QualificationService implements IQualificationService {

    private Student student;
    private final StudentService studentService;

    public QualificationService(StudentService studentService) {
        this.studentService = studentService;
    }

    private final List<Qualification> qualifications = Arrays.asList(
            new Qualification(1, 10, 8, 9, calculateAverage(10, 8, 9), student),
            new Qualification(2, 5, 5, 5, calculateAverage(5, 5, 5), student),
            new Qualification(3, 10, 5, 4.5, calculateAverage(10, 5, 4.5), student),
            new Qualification(4, 0.1, 10, 10, calculateAverage(0.1, 10, 10), student)
    );

    @Override
    public StudentDTO getQualificationByStudentId(Integer id) {
        Qualification qualification = qualifications.stream()
                .filter(q -> q.getId() == id)
                .findFirst()
                .get();

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setRegistration_number(id);
        studentDTO.setQualification1(qualification.getQualification1());
        studentDTO.setQualification2(qualification.getQualification2());
        studentDTO.setQualification3(qualification.getQualification3());
        studentDTO.setAverage(qualification.getAverage());

        return studentDTO;
    }

    private double calculateAverage(double qualification1, double qualification2, double qualification3) {
        return (qualification1 + qualification2 + qualification3) / 3.0;
    }

    @Override
    public List<StudentDTO> getQualificationsByOrder() {
        return qualifications.stream()
                .sorted(Comparator.comparingDouble(Qualification::getAverage).reversed())
                .map(this::mapToStudentDTO)
                .collect(Collectors.toList());
    }

    private StudentDTO mapToStudentDTO(Qualification qualification) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName(studentService.getStudentById(qualification.getId()).getName());
        studentDTO.setQualification1(qualification.getQualification1());
        studentDTO.setQualification2(qualification.getQualification2());
        studentDTO.setQualification3(qualification.getQualification3());
        studentDTO.setAverage(qualification.getAverage());
        return studentDTO;
    }
}