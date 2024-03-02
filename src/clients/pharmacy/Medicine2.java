package clients.pharmacy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedComponent>, Comparable<Medicine2> {
    public List<MedComponent> components;
    public int index;
    private final String name;
    public Medicine2(String name) {
        this.components = new ArrayList<>();
        this.index = 0;
        this.name = name;
    }
    public Medicine2 addComponent(MedComponent component) {
        components.add(component);
        return this;
    }

    public String getName() {
        return name;
    }

    //    @Override
//    public boolean hasNext(){
////        return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedComponent next() {
////        return components.iterator().next();
//        return components.get(index++);
//    }
    @Override
    public String toString(){
        return "Medicine: " + name + "\n";
    }

    @Override
    public Iterator<MedComponent> iterator() {
        return new Iterator<MedComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedComponent next() {
                return components.get(index++);
            }
        };
    }

//    @Override
//    public int compareTo(MedComponent o) {
//        return name.length() - o.getName().length();
//    }

    @Override
    public int compareTo(Medicine2 o) {
        return name.length() - o.name.length();
    }
}
