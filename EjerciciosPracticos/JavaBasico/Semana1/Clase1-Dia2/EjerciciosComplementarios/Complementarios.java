package Ejercicios;
import java.util.Scanner;

public class PreBootcamp {
    
    public static void main(String[] args) {
        
        System.out.println("♥ Ejercicios prácticos complementarios ♥");
        
        double num0;
        double num1;
        double num2;
        double aux;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("✰ Ejercicio Intercambio de Valores en Java ✰");
        num0 = 28;
        num1 = 01;
        System.out.println("Antes del cambio");
        System.out.println("numero 0 = " + num0 + "\n" + "numero 1 = " + num1);
        aux = num0;
        num0 = num1;
        num1 = aux;
        System.out.println("Despues del cambio");
        System.out.println("numero 0 = " + num0 + "\n" + "numero 1 = " + num1);
        
        System.out.println("✰ Ejercicio Promedio de números ✰");
        System.out.println("Introduce el primer valor");
        num0 = sc.nextInt();
        System.out.println("Introduce el segundo valor");
        num1 = sc.nextInt();
        System.out.println("Introduce el tercer valor");
        num2 = sc.nextInt();
        
        aux = num0 + num1 + num2;
        
        System.out.println("En total tenemos : " + aux);
        
        aux = aux/3;
        
        System.out.println("El promedio es : " + aux);
    }
}
