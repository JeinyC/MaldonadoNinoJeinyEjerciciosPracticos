package org.example.manager;

import org.example.model.Estudiante;
import org.example.persistencia.dao.DAO;

import java.util.Scanner;

public class Manager {

    private final DAO dao = new DAO();

    public Manager() {

    }
    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int opcion;

        while (!flag) {
            System.out.println("----- Gestion Universitaria -----");
            System.out.println("1. Muestra Estudiantes");
            System.out.println("2. Agregar Estudiante");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEstudiantes();
                    break;
                case 2:
                    aniadirEstudiante();
                    break;
                case 3:
                    flag = true;
                    break;
                default:
                    System.err.println("Inserta una opcion correcta");

            }
        }
    }

    public void mostrarEstudiantes() throws Exception {
        for (Estudiante estudiante : this.dao.getEstudiante()){
            System.out.println(estudiante);
        }
    }

    public void aniadirEstudiante() throws Exception {

        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        System.out.println("Introduce el nombre");
        estudiante.setNombre(sc.nextLine());

        System.out.println("Introduce la edad");
        estudiante.setEdad(sc.nextInt());

        System.out.println("Introduce la calificacion");
        estudiante.setCalificacion(sc.nextDouble());

        this.dao.addEstudiante(estudiante);
    }
}
