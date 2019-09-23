package Overriding;

public class Triangle extends Figure {
    public int a;
    public int b;
    public int c;
    public Triangle(int a, int b, int c){
        super(a, b, c);
    }


    public static void square(Figure triangle) {
        System.out.println(triangle.a*triangle.b*triangle.c);
    }
}
