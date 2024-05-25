package Tema_Curs42_Exercitiul3;

public class Main {
    /*
     Un client vrea sa deschida un magazin de jucarii:
 Jucariile vor avea: Culoare ( cu return )
 Jucariile vor avea interfetele : pot zbura si se pot misca;
 Jucariile valabile: PlaneToy, CarToy, DollHouse;
 Defineste clase si leaga-le de interfetele specifice.
 Apeleaza functionalitatile.
     */
    public static void main(String[] args) {
        CarToy carToy = new CarToy("rosie");
        carToy.move();
        carToy.colour();
        System.out.println();

        DollHouse dollHouse = new DollHouse("galbena");
        dollHouse.colour();
        System.out.println();

        PlaneToy planeToy = new PlaneToy("negru");
        planeToy.move();
        planeToy.fly();
        planeToy.colour();
    }
}
