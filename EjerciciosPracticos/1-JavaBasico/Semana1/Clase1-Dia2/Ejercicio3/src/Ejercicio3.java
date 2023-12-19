import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num0;
        double num1;
        double aux;

        System.out.println("♥ Ejercicio Nº 3 -  Variables y Operadores ♥");
        
        System.out.println("Calculadora de Area de tu triangulo");
        System.out.println("Introduce la base :");
        num0 = sc.nextDouble();
        System.out.println("Introduce la altura :");
        num1 = sc.nextDouble();

        aux = (num0 * num1) / 2;

        System.out.println("El area es : " + aux);
    }
}
