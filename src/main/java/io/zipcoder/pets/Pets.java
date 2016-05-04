package io.zipcoder.pets;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class Pets {

    private String name;

    public String speak(){
        return "I am a pet";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
