package com.example.University.service;

import com.example.University.DTO.StudentDTO;

import java.util.List;

public interface IQualificationService {
    StudentDTO getQualificationByStudentId(Integer id);
    List<StudentDTO> getQualificationsByOrder();
}
