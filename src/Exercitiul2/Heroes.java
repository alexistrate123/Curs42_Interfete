package Exercitiul2;

public class Heroes {
    String numeErou;

    public Heroes(String numeErou) {
        this.numeErou = numeErou;
    }

    public void apara() {
        System.out.println(numeErou + " se apara.");
    }

    public void contraAtaca() {
        System.out.println(numeErou + " contra ataca.");
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "numeErou='" + numeErou + '\'' +
                '}';
    }
}
