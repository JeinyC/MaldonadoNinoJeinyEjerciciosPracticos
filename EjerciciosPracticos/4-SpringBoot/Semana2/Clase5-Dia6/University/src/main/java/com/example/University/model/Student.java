package com.example.University.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int registration_number;
    private String name;
    private String surname;
    private LocalDate birthDate;
}
