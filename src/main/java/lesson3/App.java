package lesson3;

import Lesson4.Frogs;
import Utils.Colors;

import static Utils.Colors.ANSI_BLUE;
import static Utils.Colors.ANSI_YELLOW;
import static Utils.Print.print;
public class App {
     Car myCar = new Car("Mers", "green") {
        @Override
        public void move() {
            print(Colors.ANSI_GREEN, getModel() +" moves fast ");

        }

        @Override
        public void brake() {
            System.out.println("brake also very fast");

        }




    };
    public static void main(String[] args) {

        Frogs fr = new Frogs("fr1", 3);
        Frogs fr2 = new Frogs("fr2", 4);

        print(ANSI_YELLOW, fr);
        print(ANSI_BLUE, fr2);

    }




}

