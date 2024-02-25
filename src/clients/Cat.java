package clients;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void CatLifeCycle(){
        meow();
        toGo();
        meow();
    }
    private void meow(){
        System.out.println(getType() + " Meow");
    }
    private void toGo(){
        System.out.println(getType() + " is going");
    }
    private void toGo(String destination){
        System.out.println(getType() + " is going " + destination);
    }
    private void swim(){
        System.out.println(getType() + " swims");
    }
}