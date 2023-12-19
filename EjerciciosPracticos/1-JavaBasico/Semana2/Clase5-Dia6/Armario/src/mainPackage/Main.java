package mainPackage;

import modelPackage.*;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] arrayVestimentas = new Vestimenta[9];

        arrayVestimentas[0] = new Zapato(101, "Zapato deportivo", 59.99, "Converse", "42", "Negro", "Cuero",1);
        arrayVestimentas[1] = new Zapato(102, "Zapato formal", 79.99, "Kickers", "40", "Marrón", "Piel", 2);
        arrayVestimentas[2] = new Zapato(103, "Zapato casual", 49.99, "Vans", "39", "Rojas", "Lona", 3);

        arrayVestimentas[3] = new Pantalon(201, "Jeans", 39.99, "Levis", "M", "Azul", "Casual", "Denim");
        arrayVestimentas[4] = new Pantalon(202, "Pantalón deportivo", 29.99, "Nike", "L", "Negro", "Deportivo", "Poliamida");
        arrayVestimentas[5] = new Pantalon(203, "Pantalón de vestir", 49.99, "Zara", "S", "Gris", "Formal", "Algodón");

        arrayVestimentas[6] = new Camiseta(301, "Camiseta manga corta", 19.99, "Tommy Hilfiger", "M", "Blanco", "Corta", "Redondo");
        arrayVestimentas[7] = new Camiseta(302, "Camiseta manga larga", 24.99, "Ralph Lauren", "L", "Negro", "Larga", "V");

        arrayVestimentas[8] = new Sombrero(401, "Sombrero de ala ancha", 39.99, "H&M", "Única", "Beige", 1, 6);

        for (Vestimenta arrayVestimenta : arrayVestimentas) {
            arrayVestimenta.mensaje();
        }
    }
}