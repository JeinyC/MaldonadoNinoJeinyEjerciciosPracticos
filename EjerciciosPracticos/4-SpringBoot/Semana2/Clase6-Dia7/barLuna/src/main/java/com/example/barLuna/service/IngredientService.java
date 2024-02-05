package com.example.barLuna.service;

import com.example.barLuna.DTO.BarDTO;
import com.example.barLuna.model.Ingredient;
import com.example.barLuna.repository.BarRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientService implements IIngredientService{
    BarDTO barDTO;
    BarRepository barRepository;
    DishService dishService;


    @Override
    public BarDTO getIngredientsByDishDTO(String name) {

        barDTO.setIngredients(dishService.getIngredientsByDish(name));
        barDTO.setTotalCalories(getCalories(name));

        return barDTO;
    }

    @Override
    public int getCalories(String name) {

        int caloriesCounter = 0;
        for (int ingredientId : dishService.getDishByName(name).getIngredientes()) {
            for (Ingredient ingredient : barRepository.getIngredientsRepo()) {
                if (ingredientId == ingredient.getId()) {
                    caloriesCounter += ingredient.getCalories();

                }
            }
        }
        return caloriesCounter;
    }
}
