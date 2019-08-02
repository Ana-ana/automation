package lesson2;

public class Animal {
    // type of animal

    private String animalName; //must be private to help me to restrict access to variable and to add limits
    private String food;
    private String game;
    private int wasBorn;

    public String getAnimalName() {
        return animalName;
    }
    //added only getter cause wanted to let read only access to this variable
    /*public void setAnimalName(String name) {
        this.animalName = name;
    }*/
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
    //constructor with necessary fields for the object
    //constructor doesn't returning type and has name of the class with big letter
    public Animal(String animalName, int wasBorn) {
        this.animalName = animalName;
        this.wasBorn = wasBorn;
    }
    //empty constructor for cases when i don't know the name and age
    public Animal() {}


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
    public static void voice (String animalName, String sound){
        System.out.println("Ты можешь слышать как " + animalName + " " + sound);
    }


    public static void main(String[] args) {
       Animal cat1 = new Animal("Барсик", 1995);
      /*  eat(cat1.animalName, "Вискас");
       play(cat1.animalName, "tennis");
       Animal cat2 = new Animal();
      eat("Васька", "рыбка");
       getAge(cat2.animalName, cat2.wasBorn);
        cat2.setWasBorn(2015);
       cat2.setWasBorn(-1975);
        System.out.println(cat2.wasBorn);*/
    }
}
