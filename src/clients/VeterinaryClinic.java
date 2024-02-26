package clients;

import clients.Workers.Workers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String clinicName;
    private List<Workers> Personell = new ArrayList<>();
    private List<Animal> Illanimals = new ArrayList<>();

    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.Illanimals = new ArrayList<>();
        this.Personell = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        Illanimals.add(animal);
    }
    public void addPersonell(Workers worker){
        Personell.add(worker);
    }
    public void removeAnimal(Animal animal){
        Illanimals.remove(animal);
    }
    public void removePersonell(Workers worker){
        Personell.remove(worker);
    }
    public List<Animal> getIllFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getIllSwimmable(){
        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Swimmable){
                swimmable.add(animal);
            }
        }
        return swimmable;
    }
    public List<Animal> getIllGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }
    public List<Workers> getPersonell(){
        return Personell;
    }
    public double getSalary(Workers worker){
        return worker.getSalary();
    }
    public void setSalary(Workers worker, double salary){
        worker.setSalary(salary);
    }
}
