package clients;
@FunctionalInterface
public interface Swimmable {
    double pi = 3.1415;
    double swim();
    default void sound(){
        System.out.println("I am default method.");
    }
}
