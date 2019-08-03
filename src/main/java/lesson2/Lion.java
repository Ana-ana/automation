package lesson2;

public class Lion extends Cat {
    protected boolean bigHearHeir;


    public Lion(String animalName, String food, boolean bigHearHeir) {
        this.animalName = animalName;
        this.food = food;
        this.bigHearHeir = bigHearHeir;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public static void loveSimbe(String animalName, boolean bigHearHeir) {
        if (bigHearHeir == true) {
            System.out.println(animalName + " с большой шевелюрой любит Симбу");
        } else {
            System.out.println("Хоть у " + animalName + " шевелюра и мала, но все равно любит Симбу");
        }

    }

    public static void main(String[] args) {
        Lion king = new Lion("Король Лев", "meet", true);
        eat(king.animalName, king.food);
        king.setFood(" а теперь это(так ему и надо) укратитель");
        eat(king.animalName, king.food);
        loveSimbe(king.animalName,king.bigHearHeir);

    }
}
