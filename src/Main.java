import clients.Workers.Doctor;
import clients.Workers.Nurse;
import clients.impl.*;
import clients.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Morgan Freeman", LocalDate.of
                (1989, 5, 20), LocalDate.of
                (2020, 10, 31), 120000);
        Nurse nurse = new Nurse("Джо Байден", LocalDate.of
                (1999, 1, 20), LocalDate.of
                (2022, 9, 13), 90000);
        Animal cat = new Cat("Мурзик", 5, LocalDate.now(), new Owner());
        Animal fish = new Fish("БульБуль", 0.45f, LocalDate.now(), new Owner());
        Animal duck = new Duck("Дональд", 3, LocalDate.now(), null);
        Animal eagle = new Eagle("Арьол", 5, null, null);
        VeterinaryClinic clinic = new VeterinaryClinic("Ветеринарка топ");
        clinic.addPersonell(doc);
        clinic.addPersonell(nurse);
        clinic.addAnimal(cat);
        clinic.addAnimal(eagle);
        nurse.Vacinate(cat);
        System.out.println(clinic.getIllGoable());
        System.out.println(clinic.getSalary(doc));
        clinic.setSalary(doc, 130000);
        System.out.println(clinic.getSalary(doc));
    }
}