package Exercitiul1;

public class Main {
    /*
Exemple:
 Declara urmatoarele clase: Exercitiul1.Human, Exercitiul1.Cat, Exercitiul1.Submarine si interefetele: Exercitiul1.Swimable cu metoda voidSwim(); Exercitiul1.Eatable cu metoda void eat()
 Stabileste contractele necesare. ( implementam interfetele prin "implements" )
 Initiaza un obiect de tip Exercitiul1.Human, Exercitiul1.Cat si Exercitiul1.Submarine si apeleaza functionalitatile specifice;
     */
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Submarine submarine = new Submarine();

        human.eat();
        human.swim();
        System.out.println();

        cat.eat();
        System.out.println();

        submarine.swim();
    }

}
