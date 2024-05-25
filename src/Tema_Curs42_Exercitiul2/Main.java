package Tema_Curs42_Exercitiul2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
     Se dau clasele: Pigeon, Falcon, Duck, Ostrich, Chicken, Penguin;
 Se dau campurile: Colour, Breed, Age si metoda eat();
 Si interfetele: Flyable, cu metoda void fly(); Swimable cu metoda void swim(); Runable cu metoda alearga();
 Da valori campurilor , apeleaza metodele.
 (Optional) -> Fa o lista in care sa ai cate o pasare din fiecare si parcurge-o cu foreach si apeleaza metoda eat.
     */

    public static void main(String[] args) {
        Chicken chicken = new Chicken("Gaina", "Red", "Mountain", 9);
        chicken.alearga();
        chicken.eat();
        System.out.println();

        Duck duck = new Duck("Rata", "Brown", "Venetian", 8);
        duck.fly();
        duck.alearga();
        duck.alearga();
        duck.eat();
        System.out.println();

        Falcon falcon = new Falcon("Soimul", "Gray", "Steppe", 11);
        falcon.fly();
        falcon.eat();
        System.out.println();

        Ostrich ostrich = new Ostrich("Strutul", "Black", "African", 10);
        ostrich.alearga();
        ostrich.eat();
        System.out.println();

        Penguin penguin = new Penguin("Pinguinul", "Black","African", 12 );
        penguin.swim();
        penguin.eat();
        System.out.println();

        Pigeon pigeon =  new Pigeon("Porumbelul", "Gray", "De oras", 13);
        pigeon.fly();
        pigeon.alearga();
        pigeon.eat();

        System.out.println("________________________________________________________________________________");
        System.out.println();

        System.out.println("Optional: ");
ArrayList<Bird> bird = new ArrayList<>(Arrays.asList(
        new Pigeon("Porumbelul", "Gray", "De oras", 13),
        new Penguin("Pinguinul", "Black","African", 12 ),
        new Chicken("Gaina", "Red", "Mountain", 9 ),
        new Ostrich("Strutul", "Black", "African", 10),
        new Duck("Rata", "Brown", "Venetian", 8),
        new Falcon("Soimul", "Gray", "Steppe", 11)));


        for (Bird bird1 : bird) {
            bird1.eat();
        }

    }
}
