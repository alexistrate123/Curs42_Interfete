package Tema_Curs42_Exercitiul2;

public class Pigeon extends Bird implements Flyable, Runable {
    public Pigeon(String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void fly() {
        System.out.println("Porumbelul zboara.");
    }

    @Override
    public void alearga() {
        System.out.println("Porumbelul alearga.");
    }
}
