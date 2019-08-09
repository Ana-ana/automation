package lesson3;

public abstract class Car {
    private String model;
    private String color;
    private String maxSpeed;

    public void setModel() {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColor() {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }
    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void buyCar(){
        System.out.println("Купи машину!");
    }
    public abstract void move();
    public abstract void brake();

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }


}
