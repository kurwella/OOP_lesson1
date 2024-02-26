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
    }
}