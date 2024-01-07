package org.example.utils;
import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarInventory <T extends Car> {

    List<Car> cars = new ArrayList<>();
    public CarInventory() {
    }

    public void addCar(T car){
        this.cars.add(car);
        System.out.println("Car added : " + car);
    }

    public <T extends Car> double calculateTotalPrice(List<T> cars) {
        double totalPrice = 0.0;
        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public  <T> List<Car> searchByBrand(T key) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(key)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> searchByYear(int year) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCars() {
        return cars;
    }
}
