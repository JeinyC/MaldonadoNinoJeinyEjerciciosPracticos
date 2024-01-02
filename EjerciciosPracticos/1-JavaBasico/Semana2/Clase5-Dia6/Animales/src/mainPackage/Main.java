package mainPackage;

import modelPackage.Animal;
import modelPackage.Ave;
import modelPackage.Mamifero;
import modelPackage.Reptil;

public class Main {
    public static void main(String[] args) {

        Reptil reptil = new Reptil();
        Mamifero mamifero = new Mamifero(1, "Bonnie", 1, "dpc", "kitten", 4, "OVH", "calico","casa");
        Ave ave = new Ave();



        //Se puede acceder a estos metodos ya que son publicos
        reptil.saludar();
        mamifero.saludar();
        ave.saludar();

        //se le asigno mamifero a animal.
        Animal animal;
        animal = mamifero;
        animal.saludar();

    }
}