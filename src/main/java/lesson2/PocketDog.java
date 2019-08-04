package lesson2;

public class PocketDog extends Dog {
    protected int weight;

    public void setWeight(int weight) { this.weight = weight;}
    public int getWeight() {return weight;}

    public PocketDog(String animalName, int weight) {
        this.animalName = animalName;
        this.weight = weight;
    }
    public static void realyPocket(String animalName, int weight){
        String answer = (weight < 10) ? "Да, " + animalName + " действительно карманный" : animalName + "- серьезный пес и в карман не поместится";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        PocketDog hooch = new PocketDog("Хуч", 11);
        realyPocket(hooch.animalName, hooch.weight);
    }
}
