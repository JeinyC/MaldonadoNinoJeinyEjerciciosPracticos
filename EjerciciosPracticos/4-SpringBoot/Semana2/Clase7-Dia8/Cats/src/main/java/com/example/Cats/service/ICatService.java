package com.example.Cats.service;
import com.example.Cats.model.Cat;

import java.util.List;

public interface ICatService {

    List<Cat> getCat();
    List<Cat> getCatsByOrder();
    void saveCat(Cat cat);
    void deleteCat(Long id);
    Cat findCat(Long id);
}