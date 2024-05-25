package Tema_Curs42_Exercitiul3;

public class CarToy extends Toys implements Moveable {
    public CarToy(String colour) {
        super("Red");
        System.out.println("Masina este " + colour);
    }

    @Override
    public void move() {
        System.out.println("Masina de jucarie se misca.");
    }
}
