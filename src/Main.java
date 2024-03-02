import clients.Workers.Doctor;
import clients.Workers.Nurse;
import clients.impl.*;
import clients.*;
import clients.pharmacy.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<MedComponent> medList = new ArrayList<>();
        ArrayList<Medicine2> pillsList = new ArrayList<>();
        Asitromin asitr = new Asitromin("Asitromin", 0.5f, 25);
        Pennicilin penicilin = new Pennicilin("Pennicilin", 1.2f, 50);
        Vetbicid vetbicid = new Vetbicid("Vetbicid", 5, 30);
        Vodka vodka = new Vodka("Водочка родная", 1, 10000);
        medList.add(asitr);
        medList.add(penicilin);
        medList.add(vetbicid);

        Medicine2 medicine = new Medicine2("Ветбицин(разведенный)");
        medicine.addComponent(asitr).addComponent(penicilin).addComponent(vetbicid);

        Medicine2 medicine1 = new Medicine2("Бражка деда");
        medicine1.addComponent(penicilin).addComponent(vodka);
        Medicine2 medicine2 = new Medicine2("Бодяга");
        medicine2.addComponent(vetbicid).addComponent(vodka);

        pillsList.add(medicine);
        pillsList.add(medicine1);
        pillsList.add(medicine2);

        Comparator<Medicine2> byNameLenght = new Comparator<Medicine2>(){
            @Override
            public int compare(Medicine2 o1, Medicine2 o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
        Collections.sort(pillsList, byNameLenght);
        System.out.println(pillsList);
    }
}