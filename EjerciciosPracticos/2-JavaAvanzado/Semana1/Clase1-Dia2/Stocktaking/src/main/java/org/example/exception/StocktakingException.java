package org.example.exception;

public class StocktakingException extends Exception {
    public StocktakingException(String message) {
        super(message);
    }

    public StocktakingException() {

    }

    public void validateData(String name, double price, int quantity) throws StocktakingException {
        if (name == null || name.isEmpty() || price <= 0 || quantity < 0) {
            throw new StocktakingException("Invalid product data.");
        }
    }
}
