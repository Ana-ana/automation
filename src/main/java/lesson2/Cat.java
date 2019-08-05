package lesson2;

public class Cat extends Animal {
    private boolean mur;

    public Cat(String animalName, String food, boolean mur) {
        super(animalName, food);
        this.mur = mur;
    }
    public Cat(String animalName, int wasBorn, boolean mur) {
        super(animalName, wasBorn);
        this.mur = mur;
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
    System.out.println(barsik.getAnimalName());
    eat(barsik.getAnimalName(), "еда для барсика");
    catMur(barsik.getAnimalName(), barsik.mur);
}

}
