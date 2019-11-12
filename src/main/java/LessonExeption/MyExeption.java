package LessonExeption;

public class MyExeption extends RuntimeException {
    private String message;

    public MyExeption(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
