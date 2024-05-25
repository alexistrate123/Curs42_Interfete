package Tema_Curs42_Exercitiul2;

public class Ostrich extends  Bird implements Runable {
    public Ostrich(String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void alearga() {
        System.out.println("Strutul alearga.");
    }
}
