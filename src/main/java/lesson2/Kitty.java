package lesson2;

public class Kitty extends Cat {
    public Kitty(String animalName, int wasBorn, boolean mur){
        super(animalName, wasBorn, mur);
    }
    Kitty kitty = new Kitty("rjntyjxtr", 2005, true);
    Cat myCat = new Cat("fg", 1934, true);

    public static void main(String[] args) {
        System.out.println(Cat.getCatsQTY());

    }
}
