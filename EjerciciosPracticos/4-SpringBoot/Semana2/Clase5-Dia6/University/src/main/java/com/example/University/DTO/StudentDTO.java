package com.example.University.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private int registration_number;
    private String name;
    private double qualification1;
    private double qualification2;
    private double qualification3;
    private double average;
}