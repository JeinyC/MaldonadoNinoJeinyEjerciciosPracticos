package com.example.Cats.service;
import com.example.Cats.model.Cat;

import java.util.List;

public interface ICatService {

    public List<Cat> getCat();
    public List<Cat> getCatsByOrder();
    public void saveCat (Cat cat);
    public void deleteCat (Long id);
    public Cat findCat (Long id);
}