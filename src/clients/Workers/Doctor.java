package clients.Workers;

import clients.Animal;
import clients.Workers.Workers;

import java.time.LocalDate;

public class Doctor extends Workers {
    private Workers worker;
    public Doctor(String name, LocalDate age, LocalDate EmplDate, double salary) {
        super(name, age, EmplDate, salary);
    }
    @Override
    public void toWork() {
    }
    public void heal(Animal animal){
        System.out.println("Doctor healed " + animal.getType() + " " + animal.getName());
    }
    public void doOperation(){
        System.out.println("Doctor did an operation");
    }
}
