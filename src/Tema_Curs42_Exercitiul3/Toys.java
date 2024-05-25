package Tema_Curs42_Exercitiul3;

public class Toys {
    String colour;

    public Toys(String colour) {
        this.colour = colour;
    }

    public String colour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
