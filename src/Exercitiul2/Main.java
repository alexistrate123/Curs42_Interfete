package Exercitiul2;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
    Scrie clasele: Superman, Batman, Joker, Ironman, Hulk, Thanos, Venom, Shazam, Flash, KillMonger, Mysterio, Ultron
    Metode care nu se aplica tuturor: fly(), superPower, superSpeed();
    Metode comune: ataca(), apara(), contraAtaca()
    Clase parinte : Heroes, Villians;
    Campuri : numeErou/Raufacator.
     */

    public static void main(String[] args) {
        ArrayList<Heroes> heroes = new ArrayList<>(Arrays.asList(
                new Batman("Batman"),
                new Flash("Flash"),
                new Hulk("Hulk"),
                new Ironman("Ironman"),
                new Shazam("Shazam"),
                new Superman("Superman")));

        ArrayList<Villians> villians = new ArrayList<>(Arrays.asList(
                new Joker("Joker"),
                new KillMonger("KillMonger"),
                new Mysterio("Mysterio"),
                new Thanos("Thanos"),
                new Venom("Venom"),
                new Ultron("Ultron")));



        for (Heroes hero : heroes) {
            hero.apara();
            hero.contraAtaca();
        }

        for (Villians viliian : villians) {
            viliian.ataca();
        }
    }

}
