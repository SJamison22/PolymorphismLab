package io.zipcoder.pets;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class App {

    public static void main(String[] args) {
        Pets pets = new Pets();
        pets.setNumberOfPets();
        pets.setPetNames();
        pets.printPetNames();
    }
}
