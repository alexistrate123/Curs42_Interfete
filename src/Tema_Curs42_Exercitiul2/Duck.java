package Tema_Curs42_Exercitiul2;

public class Duck extends  Bird implements Flyable, Runable, Swimable{


    public Duck(String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void fly() {
        System.out.println("Rata zboara.");
    }

    @Override
    public void alearga() {
        System.out.println("Rata alearga.");
    }

    @Override
    public void swim() {
        System.out.println("Rata inoata.");
    }
}
