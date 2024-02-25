package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void FishLifeCycle(){
    }
    private void swim(){
        System.out.println(getType() + " swims");
    }
    private void swim(String destination){
        System.out.println(getType() + " is swimming to " + destination);
    }
}
