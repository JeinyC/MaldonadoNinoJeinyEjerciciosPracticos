import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        int limitAge = 18;
        int aux;

        System.out.println("♥ Ejercicio Nº 1 - Estructuras Condicionales ♥");

        System.out.println("Introduce tu edad usuario :");
        age = sc.nextInt();

        if(age<limitAge){
            aux = limitAge-age;
            System.out.println("No puedes entrar te faltan " + aux + " años");
        }else{
            System.out.println("Bienvenida al recital");
        }
    }
}
