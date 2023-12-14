import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double price;
        double totalPrice = 0;

        System.out.println("♥ Ejercicio Nº 2 - Estructuras Repetitivas ♥");

        do {

            System.out.println("Ingresa el precio de tu producto");
            System.out.println("Al acabar introduce 0");
            price = sc.nextDouble();
            totalPrice += price;

        } while (price > 0);

        System.out.println("En total debe abonar " + totalPrice + " $");
    }
}
