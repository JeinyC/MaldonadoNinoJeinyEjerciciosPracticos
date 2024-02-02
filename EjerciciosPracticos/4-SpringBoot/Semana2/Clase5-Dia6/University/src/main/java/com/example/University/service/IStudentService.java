package com.example.University.service;

import com.example.University.model.Student;


public interface IStudentService {
    String getStudents();
    Student getStudentById(int id);
}
