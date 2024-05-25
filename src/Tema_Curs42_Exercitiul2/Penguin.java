package Tema_Curs42_Exercitiul2;

public class Penguin extends Bird implements Swimable{

    public Penguin(String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }

    @Override
    public void swim() {
        System.out.println("Pinguinul inoata.");
    }
}
