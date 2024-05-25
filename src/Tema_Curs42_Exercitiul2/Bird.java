package Tema_Curs42_Exercitiul2;

public class Bird {
    //Colour, Breed, Age si metoda eat();
String name;
    String colour;
    String breed;
    int age;

    public Bird(String name, String colour, String breed, int age) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " mananca.");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "colour='" + colour + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
