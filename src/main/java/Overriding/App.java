package Overriding;

public class App {


    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4, 2, 4);
        r.square(r);

        Triangle tr = new Triangle(2, 6, 9);
        tr.square(tr);

        Trapezoid trapezoid = new Trapezoid(3, 4, 5, 6, 7);
        trapezoid.square(trapezoid); // getting trapezoid object

    }
}
