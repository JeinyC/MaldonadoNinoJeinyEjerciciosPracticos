package org.example.utils;
import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarInventory <T extends Car> {

    List<T> cars;
    public CarInventory() {
        this.cars = new ArrayList<>();
    }

    public void addCar(T car){
        this.cars.add(car);
        System.out.println("Car added : " + car);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (T car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public List<T> searchByBrand(String brand) {
        List<T> result = new ArrayList<>();
        for (T car : cars) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<T> searchByYear(int year) {
        List<T> result = new ArrayList<>();
        for (T car : cars) {
            if (car.getYear() == year) {
                result.add(car);
            }
        }
        return result;
    }
}
