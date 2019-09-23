package LessonExeption;

public class RerectangleArea {
    public int a;
    public int b;

    public static  int rectangleArea(int a, int b)  throws MyExeption, RuntimeException {
        if (a >0 && b>0) {
            int c = 0;
            c = a * b;
        } else  throw new MyExeption(){

        };
        return a*b;
    }
}
