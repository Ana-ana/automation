package lesson2;

public class Animal {
    // type of animal

    public String animalName;
    public String food;
    public String game;
    public int wasBorn;

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String name) {
        this.animalName = name;
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
    public void setGame(String food) {
        this.game = game;
    }
    public int getwasBorn() {
        return wasBorn;
    }
    public void setWasBorn(int wasBorn) {
        this.wasBorn = wasBorn;
    }


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




    public static void main(String[] args) {
       Animal cat = new Animal();
       cat.animalName = "Барсик";
       cat.food = "Вискас";
       cat.game = "веревочкe";
       eat(cat.animalName, cat.food);
       play(cat.animalName, cat.game);

       Animal cat2 = new Animal();
       cat2.animalName = "Рыжик";
       cat2.wasBorn = 1994;
       getAge(cat2.animalName, cat2.wasBorn);



    }
}
