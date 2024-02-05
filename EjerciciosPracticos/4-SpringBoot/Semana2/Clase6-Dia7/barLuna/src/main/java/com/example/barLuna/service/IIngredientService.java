package com.example.barLuna.service;

import com.example.barLuna.DTO.BarDTO;

public interface IIngredientService {
    int getCalories(String name);
    BarDTO getIngredientsByDishDTO(String name);
}
