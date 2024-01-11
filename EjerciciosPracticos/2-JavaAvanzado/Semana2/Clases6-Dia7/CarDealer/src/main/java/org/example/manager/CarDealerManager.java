package org.example.manager;

import org.example.model.Car;
import org.example.utils.CarInventory;

import java.util.Arrays;
import java.util.List;

public class CarDealerManager {
    public void init() {
        CarInventory<Car> carInventory = new CarInventory<>();

        List<Car> cars = Arrays.asList(
                new Car("Toyota", "Corolla", 2010, 25000.0),
                new Car("Toyota", "Civic", 2021, 22000.0),
                new Car("Ford", "Mustang", 2000, 35000.0),
                new Car("Chevrolet", "Camaro", 2000, 32000.0));

        for (Car car : cars){
            carInventory.addCar(car);
        }

        double totalPrice = carInventory.calculateTotalPrice();
        System.out.println("Total price from the inventory : " + totalPrice);

        List<Car> toyotaCars = carInventory.searchByBrand("Toyota");
        List<Car> year2000Cars = carInventory.searchByYear(2000);

        System.out.println("Toyota Cars");
        System.out.println(toyotaCars.toString());
        System.out.println("2000's Cars");
        System.out.println(year2000Cars.toString());
    }
}
