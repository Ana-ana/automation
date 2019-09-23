package Overriding;

public class Trapezoid extends Figure {
    private int height;
    private int widght;

    public Trapezoid(int a, int b, int c,int height, int widght){
        super(a, b, c);
        this.height = height;
        this.widght = widght;
    }


    public static void square(Figure figure) {
        //System.out.println(a*b);
    }

    public void square(Trapezoid figure){
        System.out.println((figure.a * figure.b * figure.c )/ figure.height);

    }
}
