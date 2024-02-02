package com.example.University.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Qualification {
    private int id;
    private double qualification1;
    private double qualification2;
    private double qualification3;
    private double average;
    private Student student;
}
