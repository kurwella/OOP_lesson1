package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimmable;

import java.time.LocalDate;

public class Lion extends Animal implements Goable, Swimmable {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public double run() {
        return 25;
    }

    @Override
    public double swim() {
        System.out.println("Lion swims");
        return 10;
    }
}
