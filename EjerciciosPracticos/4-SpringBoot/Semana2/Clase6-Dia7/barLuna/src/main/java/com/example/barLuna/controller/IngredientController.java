package com.example.barLuna.controller;

import com.example.barLuna.model.Ingredient;
import com.example.barLuna.repository.BarRepository;
import com.example.barLuna.service.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bar")
public class IngredientController {

    BarRepository barRepository;
    IngredientService ingredientService;
    public IngredientController(BarRepository barRepository) {
        this.barRepository = barRepository;
    }

    @PostMapping("/ingredient")
    public String createIngredient(@RequestBody List<Ingredient> ingredients) {
        barRepository.addIngredient(ingredients);
        return "Producto creado: " + ingredients.toString();
    }

    @GetMapping("/ingredients/dish/{name}")
    public String getIngredientsByDishDTO(@PathVariable String name) {

        return name + " tiene ingredientes " + ingredientService.getIngredientsByDishDTO(name).getIngredients() + " y " + ingredientService.getIngredientsByDishDTO(name).getTotalCalories() + " calorias.";
    }

    @GetMapping("/ingredient/{name}")
    public String getTotalCalories(@PathVariable String name) {
        return name + " tiene " + ingredientService.getCalories(name) + " calorias en total." + "\n";
    }
}
