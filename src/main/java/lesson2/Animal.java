package lesson2;

/*
    homework for 2 and 3td lessons
 */

public class Animal {
    private String animalName;
    private String food; //available for this packeg and for the heirs
    private String game;
    private int wasBorn;

    public String getAnimalName() {
        return animalName;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getGame() {
        return game;
    }
    public void setGame(String game) {
        this.game = game;
    }
    public int getwasBorn() {
        return wasBorn;
    }
    public void setWasBorn(int wasBorn) { // checking appropriate value
        if (wasBorn >=0) {
        this.wasBorn = wasBorn;
        } else {
            System.out.println("The year of birth cannot not be negative");
        }
    }

    //constructors
    public Animal(String animalName){
        this.animalName = animalName;
    }
    public Animal(String animalName, String food) {
        this.animalName = animalName;
        this.food = food;
    }

    public Animal(String animalName, int wasBorn) {
        this.animalName = animalName;
        this.wasBorn = wasBorn;
    }
    public Animal() {};


    //methods
    public static void eat(String name, String food) {
        System.out.println(food + " - " + " любимая еда " + name);
    }
    public static void play(String name, String game) {
        System.out.println(name + " играет в " + game);
    }
    public static void getAge (String name, int wasBorn) {
        int curretYear = 2019;
        System.out.println(name + " " + (curretYear - wasBorn) + " лет от роду" );
    }
    public void voice (String animalName, String sound){
        System.out.println("Ты можешь слышать как " + animalName + " " + sound);
    }
    public static void voice(String animalName, String sound, String game) {
        System.out.println(animalName + " играет в "+ game+" и "+ sound);
    } // Polymorphism - overload


    public static void main(String[] args) {
       Animal cat1 = new Animal("Барсик", 1995);
       eat(cat1.animalName, "Вискас");
       cat1.voice(cat1.animalName, "rei");
      /*
       play(cat1.animalName, "tennis");
       Animal cat2 = new Animal();
      eat("Васька", "рыбка");
       getAge(cat2.animalName, cat2.wasBorn);
        cat2.setWasBorn(2015);
       cat2.setWasBorn(-1975);
        System.out.println(cat2.wasBorn);*/
    }
}
