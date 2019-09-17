package LessonExeption;

public class MyExeption extends Exception {
   // int a = 1;
    private String message = "Ты совершил ошибку, чувак! Числа отрицательны";

    public MyExeption(String message) {
        this.message=message;

    }

    @Override
    public String getMessage() {
        return message;
    }

//        public void setMessage(String message) {
//        this.message = message;
//    }
//
//    @Override
//    public String toString() {
//        return this.message;
//    }
//
//    public int getError(MyExeption m){
//        System.out.println(m.getMessage());
//        return 1;
//    }

}
