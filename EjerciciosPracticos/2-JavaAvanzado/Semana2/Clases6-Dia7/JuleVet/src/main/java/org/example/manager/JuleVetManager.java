package org.example.manager;

import org.example.model.Pet;
import org.example.utils.PetRegistration;
import java.util.*;
public class JuleVetManager {

    public void init() {
            PetRegistration<Pet<String>> registry = new PetRegistration<>();

            Pet<String> dog = new Pet<>("D001", "Java", 3, "Dog");
            Pet<String> cat = new Pet<>("C001", "Bonnie", 2, "Cat");
            Pet<String> reptile = new Pet<>("R001", "Spike", 5, "Reptile");
            Pet<String> bird = new Pet<>("B001", "Tweetie", 1, "Bird");

            registry.addPet(dog);
            registry.addPet(cat);
            registry.addPet(reptile);
            registry.addPet(bird);

            List<Pet<String>> pets = PetRegistration.getPetList();
            System.out.println("Pet List:");
            for (Pet<String> pet : pets) {
                System.out.println(pet);
            }
            System.out.println( );

            List<Pet<String>> petByName = registry.searchByName("Bonnie");
            System.out.println("Pet By Name Bonnie: ");
            for (Pet<String> pet : petByName) {
                    System.out.println(pet);
            }
            System.out.println( );

            List<Pet<String>> petBySpecie = registry.searchBySpecies("Dog");
            System.out.println("Pet By Species Dog: ");
            for (Pet<String> pet : petBySpecie) {
                    System.out.println(pet);
            }
            System.out.println( );

            System.out.println("There are " + registry.numberOfPets() + " pets in the system");
            System.out.println( );

            System.out.println("Random Data:");
            registry.generateRandomData();
    }
}
