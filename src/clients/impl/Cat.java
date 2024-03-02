package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    public void CatLifeCycle() {
        meow();
        meow();
        run();
    }

    private void meow() {
        System.out.println(getType() + " Meow");
    }

    @Override
    public double run() {
        return 15;
    }
}