package Tema_Curs42_Exercitiul2;

public class Falcon extends Bird implements Flyable {
    public Falcon(String name ,String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void fly() {
        System.out.println("Soimul zboara.");
    }
}
