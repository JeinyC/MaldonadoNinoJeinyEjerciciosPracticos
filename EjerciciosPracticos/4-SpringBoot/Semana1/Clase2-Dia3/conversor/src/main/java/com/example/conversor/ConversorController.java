package com.example.conversor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    @GetMapping("/convertir/{cm}")
    public String conversor(@PathVariable double cm){
        return "cm convertido a m : " + cm/100;
    }
}
