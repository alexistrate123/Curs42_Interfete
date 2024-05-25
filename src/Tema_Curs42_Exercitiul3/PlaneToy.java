package Tema_Curs42_Exercitiul3;

public class PlaneToy extends Toys implements Flyable, Moveable {
    public PlaneToy(String colour) {
        super(colour);
        System.out.println("Avionul de jucarie este " + colour);
    }

    @Override
    public void fly() {
        System.out.println("Avionul de jucarie zboara.");
    }

    @Override
    public void move() {
        System.out.println("Avionul de jucarie se misca.");
    }
}
