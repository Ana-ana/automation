package LessonExeption;

public class RerectangleArea {
    public int a;
    public int b;
    private String result;

    public int rectangleArea(int a, int b)  throws MyExeption, RuntimeException {
        if (a >0 && b>0){
            int c = 0;
            try {
                c=a*b;

            }
            catch (MyExeption | RuntimeException mE){
                MyExeption mE = new MyExeption("Ошибка");
                mE.getError(mE);
            }
            return a*b;
        }
    }
}
