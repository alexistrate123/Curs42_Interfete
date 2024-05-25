package Tema_Curs42_Exercitiul1;

public class Telefon implements TelefonBehaviour {
String name;

    public Telefon(String name) {
        this.name = name;
    }

    @Override
    public void recharge() {
        System.out.println(name + " se incarca.");
    }

    @Override
    public void ring() {
        System.out.println(name + " suna.");
    }
}
