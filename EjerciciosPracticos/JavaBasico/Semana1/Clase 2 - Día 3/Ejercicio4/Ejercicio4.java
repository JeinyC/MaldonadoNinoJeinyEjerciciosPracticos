import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("♥ Ejercicio Nº 4 - Matrices ♥");

        Scanner sc = new Scanner(System.in);
        char[][] asientos = new char[5][5];
        char vacio = '0';
        char lleno = 'X';
        int selectFila;
        int selectCol;
        boolean flag = true;
        boolean flagAsientos = true;
        String aux;

        System.out.println("Bienvenida a J.C Circus");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = vacio;
            }
        }

        while (flag) {
            System.out.println("Estos son los asientos libres");
            for (int i = 0; i < asientos.length; i++) {

                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println("Fila - " + (i + 1));
            }

            do {
                System.out.println("Seleciona una Fila 1 - 5");
                selectFila = sc.nextInt();
                System.out.println("Seleciona una Asiento 1 - 5");
                selectCol = sc.nextInt();

                if (selectFila < 1 || selectFila > 5 || selectCol < 1 || selectCol > 5) {
                    System.out.println("Slecciona un asiento existente");
                } else {
                    flagAsientos = false;
                }
            } while (flagAsientos);

            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5; j++) {
                    if (i - 1 == (selectFila - 1) && j - 1 == (selectCol - 1)) {
                        if (asientos[i - 1][j - 1] == vacio) {
                            asientos[i - 1][j - 1] = lleno;
                        } else {
                            System.out.println("Este asiento ya esta ocupado, elige otro");
                        }
                    }
                }
            }

            System.out.println("Deseas comprar otra entrada S/N");
            aux = sc.next();

            if (aux.equalsIgnoreCase("n")) {
                flag = false;
            }
        }
    }
}
