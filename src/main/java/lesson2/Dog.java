package lesson2;

public class Dog extends Animal {
    protected boolean rrrrrr;

    public void setRrrrrr(boolean rrrrrr) {
        this.rrrrrr = rrrrrr;
    }
    public boolean getRrrrrr() { return rrrrrr;}

      public Dog( String animalName, boolean rrrrrr){
            this.animalName = animalName;
            this.rrrrrr = rrrrrr;
      }

    public static void guard(String animalName, boolean rrrrrr){
        String guardiness = (rrrrrr == true) ? animalName +" охраняет тебя" : "фиг тебе, а не охрана, корми лучше ";
        System.out.println(guardiness);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Тузик", false);
        eat(dog.animalName, "косточки");// method from super class
        dog.setRrrrrr(true);
        guard(dog.animalName, dog.rrrrrr);
        dog.setRrrrrr(false);
        guard(dog.animalName, dog.rrrrrr);
    }

}