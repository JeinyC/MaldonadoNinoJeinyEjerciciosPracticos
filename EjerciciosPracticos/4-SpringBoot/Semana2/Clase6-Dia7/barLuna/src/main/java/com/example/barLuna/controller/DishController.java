package com.example.barLuna.controller;

import com.example.barLuna.repository.BarRepository;
import com.example.barLuna.model.Dish;
import com.example.barLuna.service.DishService;
import com.example.barLuna.service.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bar")
public class DishController {

    BarRepository barRepository;
    DishService dishService;
    IngredientService ingredientService;

    public DishController(BarRepository barRepository, DishService dishService, IngredientService ingredientService) {
        this.barRepository = barRepository;
        this.dishService = dishService;
        this.ingredientService = ingredientService;
    }

    @PostMapping("/dish")
    public String createDish(@RequestBody List<Dish> dishes) {
        barRepository.addDish(dishes);
        return "Producto creado: " + dishes.toString();
    }

    @GetMapping("/dish/{name}")
    public String getTotalCalories(@PathVariable String name) {
        return name + " tiene " + ingredientService.getCalories(name) + " calorias en total." + "\n";
    }

    @GetMapping("/dish/calories/{name}")
    public String getHigherCalorieIngredient(@PathVariable String name) {
        return name + " ingrediente con la mayor cantidad de calorías - " + "\n";
    }
}





