package com.example.barLuna.DTO;

import com.example.barLuna.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarDTO {
    private int totalCalories;
    private List<String> ingredients;
}
