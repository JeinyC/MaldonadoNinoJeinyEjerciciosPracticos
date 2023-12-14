import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num0;
        int num1;
        int suma;
        int resta;
        int multi;
        int div;
        
        System.out.println("♥ Ejercicio Nº 4 y Extra - Operaciones de Lectura ♥");

        System.out.println("Introduce un valor numerico entero");
        num0 = sc.nextInt();
        
        do {
            System.out.println("Introduce otro valor numerico entero, que NO puede ser 0");
            num1 = sc.nextInt();
        } while (num1 == 0);

        suma = num0 + num1;
        resta = num0 - num1;
        multi = num0 * num1;
        div = num0 / num1;

        System.out.println("⛤⛤⛤ La suma es -> " + suma);
        System.out.println("⛤⛤⛤ La resta es -> " + resta);
        System.out.println("⛤⛤⛤ La multiplicacion es -> " + multi);
        System.out.println("⛤⛤⛤ La division es -> " + div);
    }
}
