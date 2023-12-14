import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("♥ Ejercicio Nº 3 - Arreglos: Vectores ♥");

        Scanner sc = new Scanner(System.in);
        double[] temp = new double[7];
        double promedio = 0;

        for (int i = 0; i < temp.length; i++) {

            System.out.println("Ingresa las temperaturas maximas:");
            temp[i]=sc.nextDouble();
        }

        for (int i = 0; i < temp.length; i++) {

            promedio += temp[i];
        }

        System.out.println("El promedio es "+promedio/7+ " grados");
    }
}

