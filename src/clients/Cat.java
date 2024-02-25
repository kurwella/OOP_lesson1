package clients;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void CatLifeCycle(){
        meow();
        run();
        meow();
    }
    private void meow(){
        System.out.println(getType() + " Meow");
    }
    private void run(){
        System.out.println(getType() + " runs");
    }
    private void swim(){
        System.out.println(getType() + " swims");
    }
}