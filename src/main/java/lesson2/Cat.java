package lesson2;

public class Cat extends Animal {
    protected boolean mur;
    protected String animalName; //must be private to help me to restrict access to variable and to add limits
    protected String food;
    protected String game;
    protected int wasBorn;

    public Cat() {}
    public Cat(String animalName, String food) {
        this.animalName = animalName;
        this.food = food;
    }
    public Cat(String animalName, String food, String game, int wasBorn, boolean mur) {
        this.animalName = animalName;
        this.food = food;
        this.game = game;
        this.wasBorn = wasBorn;
        this.mur = mur;
    }
    public Cat(String animalName, String food, String game, boolean mur, int wasBorn) {
        super(animalName, wasBorn); // from super class - doesn't work
        this.food = food;
        this.game = game;
        this.mur = mur;
    }
    public Cat(String animalName, int wasBorn, boolean mur) {
        //super(animalName, wasBorn); // from super class and it doesn't work!!!!
        // why inheriting constructor from super class doesn't apply value of animal name to object barsik
        this.animalName = animalName;
        this.wasBorn = wasBorn;
        this.mur = mur;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public static void catMur(String animalName, boolean mur){
        if (mur == true) {
            System.out.println(animalName + " мурлыкает");
        } else {
            System.out.println("Не дождать тебе притственного мурррра");
        }
    }


    public static void main(String[] args) {
    Cat barsik = new Cat("BarsikSName", 1078, true);
    System.out.println(barsik.animalName);
    eat(barsik.animalName, "еда для барсика");
    barsik.setAnimalName("Second_Barsik_name");
    catMur(barsik.animalName, barsik.mur);
}

}
