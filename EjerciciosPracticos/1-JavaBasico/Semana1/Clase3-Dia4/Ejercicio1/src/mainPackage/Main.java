package mainPackage;
import modelPackage.Electrodomestico;

public class Main {
    public static void main(String[] args) {

        System.out.println("♥ Ejercicio Nº 1 - Clases y Objetos ♥");

        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        Electrodomestico Electo1 = new Electrodomestico(00,"samsung",1,100,"gris");
        Electrodomestico Electo2 = new Electrodomestico(01,"samsung",2,200,"gris");
        Electrodomestico Electo3 = new Electrodomestico(02,"samsung",3,300,"gris");

        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico Electo = new Electrodomestico();

        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos
        //creados con parámetros.
        System.out.println(Electo1);
        System.out.println(Electo2);
        System.out.println(Electo3);

        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor?
        //De ser así… ¿Qué valor se obtiene?
        System.out.println(" - Sin parametros - ");
        System.out.println(Electo);
        //Imprime el objeto vacio
    }
}