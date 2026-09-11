package net.explorviz.test;

import net.explorviz.test.Animal;
import net.explorviz.test.Cat;
import java.util.List;
import java.util.ArrayList;

public class Dog extends Animal implements Speakable {

    private String breed;
    private List<String> tricks;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        this.tricks = new ArrayList<>();
    }

    public String getBreed() {
        return breed;
    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }

    public List<String> getTricks() {
        return tricks;
    }

    @Override
    public void speak() {
        System.out.println(getMessage());
    }
}
