package Exercitiul2;

public class Villians {
    String numeRaufacator;

    public Villians(String numeRaufacator) {
        this.numeRaufacator = numeRaufacator;
    }

    public void ataca() {
        System.out.println(numeRaufacator + " ataca.");
    }

    @Override
    public String toString() {
        return "Villians{" +
                "numeRaufacator='" + numeRaufacator + '\'' +
                '}';
    }
}
