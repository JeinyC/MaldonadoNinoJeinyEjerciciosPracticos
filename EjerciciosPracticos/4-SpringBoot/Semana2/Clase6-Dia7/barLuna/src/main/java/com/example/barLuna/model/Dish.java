package com.example.barLuna.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private int id;
    private String nombre;
    private List<Integer> ingredientes;
}

