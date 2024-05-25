package Tema_Curs42_Exercitiul2;

public class Chicken extends Bird implements Runable {


    public Chicken(String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void alearga() {
        System.out.println("Gaina alearga.");
    }
}
