package com.example.barLuna.repository;
import com.example.barLuna.model.Dish;

import java.util.ArrayList;
import java.util.List;

import com.example.barLuna.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class BarRepository {
    List<Dish> dishesRepo = new ArrayList<>();
    List<Ingredient> ingredientsRepo = new ArrayList<>();

    public void addDish(List<Dish> dishes) {
        dishesRepo.addAll(dishes);
    }
    public void addIngredient(List<Ingredient> ingredients) {
        ingredientsRepo.addAll(ingredients);
    }
}
