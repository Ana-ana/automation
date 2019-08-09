package lesson3;

public class Human implements Swimmable, eat {
    public void swim() {
        System.out.println("Человек плывет");
    }
    public void eat() {
        System.out.println("Человек всеяден");
    }

    public static void main(String[] args) {
        Human man = new Human();
        man.swim();
        man.eat();
        man.move();
    }
}
