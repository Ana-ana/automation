package lesson2;

public class Cat extends Animal {
    private boolean mur;
    private static int catsQTY = 0;
    public String string;


    public static int getCatsQTY() {
        return catsQTY;
    }

    public boolean isMur() {
        return mur;
    }

    public Cat(String animalName, String food, boolean mur) {
        super(animalName, food);
        this.mur = mur;
        catsQTY++;
    }
    public Cat(String animalName, int wasBorn, boolean mur) {
        super(animalName, wasBorn);
        this.mur = mur;
    }
    public Cat() {
    }

    public static void catMur(String animalName, boolean mur){
        if (mur == true) {
            System.out.println(animalName + " мурлыкает из метода класса Cat");
        } else {
            System.out.println("Не дождать тебе притственного мурррра");
        }
    }
    //Overload
    public static void catMur(String animalName, boolean mur, String food){
        if (mur == true) {
            System.out.println(animalName + " мурлыкает из метода класса Cat когда ест "+food);
        } else {
            System.out.println("Не дождать тебе притственного мурррра");
        }
    }
    public Cat getCat(Cat cat) {
        return cat;
    }



    public static void main(String[] args) {
    Cat barsik = new Cat("BarsikSName", 1078, true);
    Cat barsik2 = new Cat("BarsikSName", 1078, true);
    System.out.println(barsik.getAnimalName());
    eat(barsik.getAnimalName(), "еда для барсика");
    catMur(barsik.getAnimalName(), barsik.mur);
        System.out.println(getCatsQTY());

}

}
