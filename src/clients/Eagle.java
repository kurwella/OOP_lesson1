package clients;

import java.time.LocalDate;

public class Eagle extends Animal{
    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void EagleLifeCycle(){
        cleanFeathers();
        fly("mounts", "hunt");
        hunt();
    }
    private void cleanFeathers(){
        System.out.println(getType() + " cleans feathers");
    }
    private void fly(){
        System.out.println(getType() + " flies");
    }
    private void fly(String place){
        System.out.println(getType() + " is flying to " + place);
    }
    private void fly(String place, String goal){
        System.out.println(getType() + "is flying to " + place + " for " + goal);
    }
    private void hunt(){
        System.out.println(getType() + " is hunting");
    }
}
