package Tema_Curs42_Exercitiul1;

public class Smartphone implements SmartphoneBehaviour {
    String name;

    public Smartphone(String name) {
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

    @Override
    public void screenshot() {
        System.out.println(name + " face screenshot-uri.");
    }

    @Override
    public void downloadApps() {
        System.out.println(name + " descarca aplicatii.");
    }
}
