package io.zipcoder.pets;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class App {

    public static void main(String[] args) {
        PetInfo petInfo = new PetInfo();
        petInfo.setNumberOfPets();
        petInfo.setPetNames();
        petInfo.printPetNames();
    }
}
