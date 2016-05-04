package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class Pets {

    Scanner input = new Scanner(System.in);

    private int numberOfPets;
    private String[] petNames;

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
     * Prints all pet names in array.
     */
    public void printPetNames(){
        for(int i = 0; i < petNames.length; i++){
            System.out.println("Pet "  + (i+1) + "'s name: " + petNames[i]);
        }
    }
}
