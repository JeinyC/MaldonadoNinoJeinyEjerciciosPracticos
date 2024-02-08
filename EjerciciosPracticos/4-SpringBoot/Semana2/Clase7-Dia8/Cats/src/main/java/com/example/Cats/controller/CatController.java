package com.example.Cats.controller;

import com.example.Cats.model.Cat;
import com.example.Cats.service.ICatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {
    @Autowired
    private ICatService iCatService;

    @GetMapping("/get")
    public List<Cat> getCat() {
        return iCatService.getCat();
    }

    @GetMapping("/get/order")
    public List<Cat> getCatsByOrder() {
        return iCatService.getCatsByOrder();
    }

    @PostMapping("/create")
    public String saveCat(@RequestBody Cat perso) {
        iCatService.saveCat(perso);
        return "Cat creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCat(@PathVariable Long id) {
        iCatService.deleteCat(id);
        return "Cat eliminadacorrectamente";
    }

    @PutMapping("/edit/{id}")
    public Cat editCat(@PathVariable Long id,
                           @RequestParam("name") String nameMod,
                           @RequestParam("price") double priceMod) {

        Cat cat = iCatService.findCat(id);

        cat.setName(nameMod);
        cat.setPrice(priceMod);


        iCatService.saveCat(cat);

        return cat;
    }
}


