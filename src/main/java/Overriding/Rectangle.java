package Overriding;

import LessonExeption.RerectangleArea;

public class Rectangle extends Figure {
    private int d;

    public int getD() {
        return this.d;
    }

    public Rectangle(int a, int b, int c, int d){
        super(a, b, c);
        this.d = d;
    }

    @Override
    public void square(Figure rectangle) {
        System.out.println(rectangle.a*rectangle.b);
    }
}
