package com.example.University.service;

import com.example.University.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {

    public List<Student> students = Arrays.asList(
            new Student(1, "John", "Doe", LocalDate.of(2000, 5, 10)),
            new Student(2, "Maria", "Gomez", LocalDate.of(1999, 8, 22)),
            new Student(3, "Ahmed", "Khan", LocalDate.of(2001, 3, 5)),
            new Student(4, "Yuki", "Tanaka", LocalDate.of(2002, 1, 15))
    );

    @Override
    public String getStudents() {
        return students.stream()
                .map(Student::toString)
                .collect(Collectors.joining(", "));
    }

    @Override
    public Student getStudentById(int id){
        return  students.stream()
                .filter(stu -> stu.getRegistration_number() == id)
                .findFirst()
                .orElse(null);
    }
}
