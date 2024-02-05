package com.example.barLuna.service;


import com.example.barLuna.DTO.BarDTO;
import com.example.barLuna.model.Dish;
import com.example.barLuna.model.Ingredient;
import com.example.barLuna.repository.BarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService implements IDishService {

    BarRepository barRepository;
    BarDTO barDTO;

    public DishService(BarRepository barRepository, BarDTO barDTO) {
        this.barRepository = barRepository;
        this.barDTO = barDTO;
    }

    public Dish getDishByName(String name) {
        for (Dish dish : barRepository.getDishesRepo()) {
            if (dish.getNombre().equalsIgnoreCase(name)) {
                return dish;

            }
        }
        return null;
    }

    public List<String> getIngredientsByDish(String name) {
        List<String> ingredients = new ArrayList<>();
        for (int ingredientId : getDishByName(name).getIngredientes()) {
            for (Ingredient ingredient : barRepository.getIngredientsRepo()) {
                if (ingredientId == ingredient.getId()) {
                    ingredients.add(ingredient.getName());
                }
            }

        }
        return ingredients;
    }

    public void getHighCalorieIngredient(String name){
        for (int ingredientId : getDishByName(name).getIngredientes()){

        }
    }


}

