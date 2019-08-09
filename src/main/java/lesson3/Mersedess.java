package lesson3;

public class Mersedess extends Car {
    private boolean myMersedess;
    public void setMyMersedess(boolean myMersedess) {
        this.myMersedess = myMersedess;
    }
    public boolean getmyMersedess() {
        return myMersedess;
    }

    @Override
    public void move() {
        System.out.println("ну поехали уже");
    }

    @Override
    public void brake() {
        System.out.println("Тормози!");
    }
    public Mersedess(String model, String color, boolean myMersedess) {
        super(model, color);
        this.myMersedess = myMersedess;
    }

    public static void main(String[] args) {
        Mersedess mers = new Mersedess("E", "red", true);

    }
}
