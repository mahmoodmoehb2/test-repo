package net.explorviz.test;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return name + " makes a sound.";
    }
}
