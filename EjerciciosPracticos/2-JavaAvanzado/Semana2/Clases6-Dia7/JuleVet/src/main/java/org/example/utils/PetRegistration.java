package org.example.utils;

import org.example.model.Pet;

import java.util.*;

public class PetRegistration<T> {
    //Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays
    //junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
    //
    //Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener
    //el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
    //
    //Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios,
    //como nombres, edades o especies, para agregar mascotas al registro.


    private static List<Pet<String>> petList;
    private static Random random;

    public PetRegistration() {

        petList = new ArrayList<>();
        random = new Random();
    }

    public void addPet(Pet<String> pet) {
        petList.add(pet);
        System.out.println("Added: " + pet.toString());
    }

    public List<Pet<String>> searchByName(String name) {
        List<Pet<String>> petsFound = new ArrayList<>();
        for (Pet<String> pet : petList) {
            if (pet.getName().equalsIgnoreCase(name)) {
                petsFound.add(pet);
            }
        }
        return petsFound;
    }

    public List<Pet<String>> searchBySpecies(String species) {
        List<Pet<String>> mascotasEncontradas = new ArrayList<>();
        for (Pet<String> pet : petList) {
            if (pet.getSpecies().equalsIgnoreCase(species)) {
                mascotasEncontradas.add(pet);
            }
        }
        return mascotasEncontradas;
    }

    public int numberOfPets (){
        return petList.size();
    }
    public static List<Pet<String>> getPetList() {
        return petList;
    }
    public void generateRandomData() {
        String[] names = {"Bobby", "Luna", "Max", "Coco", "Lola"};
        String[] species = {"Dog", "Cat", "Reptile", "Bird"};
        int ages = (int) (Math.random() * 16);
        String[] code = {"D002", "D005", "D035"};

        String randomName = names[random.nextInt(names.length)];
        String randomspecies = species[random.nextInt(species.length)];
        int randomAge = random.nextInt(ages);
        String randomCode = code[random.nextInt(code.length)];

        System.out.println("Code : " + randomCode);
        System.out.println("Name : " + randomName);
        System.out.println("Specie : " + randomspecies);
        System.out.println("Age : " + randomAge);
    }
}
