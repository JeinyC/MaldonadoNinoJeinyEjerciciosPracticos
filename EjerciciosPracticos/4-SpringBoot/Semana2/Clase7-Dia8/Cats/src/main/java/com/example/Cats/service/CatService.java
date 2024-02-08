package com.example.Cats.service;

import com.example.Cats.model.Cat;
import com.example.Cats.repository.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatService implements ICatService{

    @Autowired
    private CatRepo catRepo;

    @Override
    public List<Cat> getCat() {
        return catRepo.findAll();
    }

    @Override
    public List<Cat> getCatsByOrder() {
        return catRepo.findAll().stream()
                .sorted(Comparator.comparingDouble(Cat::getPrice).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public void saveCat(Cat cat) {
        catRepo.save(cat);
    }

    @Override
    public void deleteCat(Long id) {
        catRepo.deleteById(id);
    }

    @Override
    public Cat findCat(Long id) {
        return catRepo.findById(id).orElse(null);
    }
}
