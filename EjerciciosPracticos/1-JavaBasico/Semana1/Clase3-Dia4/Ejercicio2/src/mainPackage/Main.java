package mainPackage;

import modelPackage.Persona;

public class Main {
    public static void main(String[] args) {

        System.out.println("♥ Ejercicio Nº 2 - POO ♥");

        //a) Crear un vector de tipo Persona cinco posiciones, Crear cinco personas y guardarlas en él.
        Persona p1 = new Persona(0,"Jule", 27, "Chile 13", 999111222);
        Persona p2 = new Persona(0,"Jimmy", 8, "Espana 04", 999777666);
        Persona p3 = new Persona(0,"Jeiny", 23, "Espana 04", 666777000);
        Persona p4 = new Persona(0,"Aintzane", 55, "Espana 04", 666333000);
        Persona p5 = new Persona(0,"Noelia", 45, "Espana 84", 666333111);
        Persona [] arrayPersona = {p1,p2,p3,p4,p5};


        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        System.out.println("- - - - Datos de usuario - - - -");
        for (int i = 0; i < arrayPersona.length; i++) {
            System.out.println((i+1)+" - Nombre: "+ arrayPersona[i].getNombre() + " - Edad: " + arrayPersona[i].getEdad());
        }

        //c) Cambiar el nombre de dos personas.
        System.out.println("- - - - Datos previos al cambio de identidad - - - -");
        for (int i = 0; i < arrayPersona.length; i++) {
            System.out.println((i+1)+" - Nombre: "+ arrayPersona[i].getNombre());
        }
        p3.setNombre("Arty");
        p1.setNombre("Evee");

        // Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        System.out.println("- - - - Datos post cambio de identidad - - - -");
        for (int i = 0; i < arrayPersona.length; i++) {
            System.out.println((i+1)+" - Nombre: "+ arrayPersona[i].getNombre());
        }

        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        System.out.println("- - - - Datos de las personas mayores de 30 - - - -");
        for (int i = 0; i < arrayPersona.length; i++) {
            if (arrayPersona[i].getEdad()>30){
                System.out.println(arrayPersona[i].toString());
            }
        }
    }
}