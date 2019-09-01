package lesson3;

import Utils.Colors;

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
        String s = "hjknkj";
        print(Colors.ANSI_YELLOW, s);
    }

}

