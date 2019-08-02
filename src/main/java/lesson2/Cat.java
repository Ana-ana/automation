package lesson2;

public class Cat extends Animal {
    private boolean mur;
    private String animalName; //must be private to help me to restrict access to variable and to add limits
    private String food;
    private String game;
    private int wasBorn;

    public Cat(String animalName, String food, String game, int wasBorn, boolean mur) {
        this.animalName = animalName;
        this.food = food;
        this.game = game;
        this.wasBorn = wasBorn;
        this.mur = mur;
    }
    public Cat(String animalName, String food, String game, boolean mur, int wasBorn) { //deleted wasBorn
        super(animalName, wasBorn); // from super class
        this.food = food;
        this.game = game;
        this.mur = mur;
    }


    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    Cat barsik = new Cat("catsName", "meet", "someGame", 1078, true);
    barsik.setAnimalName ("second_real_name");
    eat(barsik.animalName, "food");



}
