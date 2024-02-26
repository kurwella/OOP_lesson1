import clients.impl.*;
import clients.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Мурзик", 5, LocalDate.now(), new Owner());
        Swimmable fish = new Fish("БульБуль", 0.45f, LocalDate.now(), new Owner());
        fish.sound();
        List<Animal> flyable = new ArrayList<>();
        flyable.add(new Duck("Дональд", 3, LocalDate.now(), null));
        flyable.add(new Eagle("Арьол", 5, null, null));
        flyable.add(cat);
        for (Animal animals : flyable){
            if (animals instanceof Flyable){
                ((Flyable)animals).fly();
            }
        }
    }
}