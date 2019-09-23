package Overriding;

import LessonExeption.MyExeption;
import LessonExeption.RerectangleArea;
import com.sun.tools.hat.internal.parser.Reader;
import lesson2.Cat;

public class App {


    public static void main(String[] args) {
//        Rectangle r = new Rectangle(2, 4, 2, 4);
//        r.square(r);
//
//        Triangle tr = new Triangle(2, 6, 9);
//        tr.square(tr);
//
//        Trapezoid trapezoid = new Trapezoid(3, 4, 5, 6, 7);
//        trapezoid.square(trapezoid); // getting trapezoid object
//        Rectangle rectangle = new Rectangle(0,1,3,4);
//        int a = 3;
//        int b = 5;
//        try {
//            RerectangleArea.rectangleArea(a, b);
//        }
//        catch (MyExeption e){
//            e.printStackTrace();
//            throw new  IllegalArgumentException(e);
//            return 1;
        System.out.println(method().string);;
    }
        public static Cat method() {
            Cat a = new Cat();
            try {
                a.string = "dfcm";
                return a;
            }
            finally {
                a.string = "tttt";
                //System.out.println( a.string);
            }



        }
    }

