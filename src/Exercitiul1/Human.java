package Exercitiul1;

public class Human implements Eatable, Swimable {

    @Override
    public void eat() {
        System.out.println("Omul mananca.");
    }

    @Override
    public void swim() {
        System.out.println("Omul inoata.");
    }
}
