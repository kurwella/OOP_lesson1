package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimmable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    public void FishLifeCycle(){
        swim();
    }

    @Override
    public double swim() {
        return 20;
    }
}
