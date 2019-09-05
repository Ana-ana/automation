package lesson2;

public class Kitty extends Cat {

    public Kitty(String animalName, int wasBorn, boolean mur){
        //super(animalName, wasBorn, mur);

    }
    //hiding catMur method
   public static void catMur(String animalName, boolean mur){
       if (mur == true){
           System.out.println(animalName + " мурлыкает из метода класса Kitty");
       } else {
           System.out.println("Не дождать тебе притственного мурррра");
       }

   }
    public static void main(String[] args) {
        Kitty kitty = new Kitty("rjntyjxtr", 2005, true);
        Cat myCat = new Cat("fg", "food", true);
        System.out.println(Cat.getCatsQTY());
        catMur(myCat.getAnimalName(), myCat.isMur());

    }
}
