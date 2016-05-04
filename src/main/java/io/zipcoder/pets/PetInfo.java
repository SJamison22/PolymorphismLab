package io.zipcoder.pets;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class PetInfo {

    Dogs dog = new Dogs();
    Cats cat = new Cats();
    Pigs pig = new Pigs();
    Scanner input = new Scanner(System.in);

    private int numberOfPets;
    private String[] petNames;
    private int[] petTypes;

    /**
     * Get integer from user and return it.
     * @param msg
     * @return
     */
    public int getUserInt(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        int ans = input.nextInt();
        return ans;
    }

    /**
     * Get string from user and return it.
     * @param msg
     * @return
     */
    public String getUserString(String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        String ans = input.nextLine();
        return ans;
    }

    /**
     * Gets number of pets from user.
     */
    public void setNumberOfPets(){
        numberOfPets = getUserInt("How many pets do you have?");
    }

    /**
     * Returns the number of pets stored.
     * @return
     */
    public int getNumberOfPets() {
        return numberOfPets;
    }

    /**
     * Prompts user to set pet names and stores them in array.
     */
    public void setPetNames(){
        petNames = new String[getNumberOfPets()];
        for(int i = 0; i < getNumberOfPets(); i++){
            String ans = getUserString("What is pet number " + (i+1) + "'s" + " name?");
            petNames[i] = ans;
        }
    }

    /**
     * Sets the type of pet.
     */
    public void setPetType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to select pet type:");
        petTypes = new int[getNumberOfPets()];
        for (int i = 0; i < petNames.length; i++) {
            System.out.println("Is " + petNames[i] + " a:\n1: Dog\n2: Cat\n3: Pig?");
            int ans = input.nextInt();
            petTypes[i] = ans;
        }
    }

    /**
     * Prints all pet names and speak methods in array.
     */
    public void printPets(){
        String speak;
        for(int i = 0; i < petNames.length; i++) {
            if (petTypes[i] == 1) {
                speak = dog.speak();
            } else if (petTypes[i] == 2){
                speak = cat.speak();
            } else {
                speak = pig.speak();
        }
            System.out.println("Pet "  + (i+1) + "'s name is " + petNames[i] + " and "
                    + petNames[i] + " says " + speak);
        }
    }





}
