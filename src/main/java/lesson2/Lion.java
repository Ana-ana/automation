package lesson2;

public class Lion extends Cat {
    private boolean bigHearHeir;
    public void setBigHearHeir() {
        this.bigHearHeir = bigHearHeir;
    }
    public boolean getBigHearHeir() { return bigHearHeir;}


    public Lion(String animalName, String food, boolean mur, boolean bigHearHeir) {
        super(animalName, food, mur);
        this.bigHearHeir = bigHearHeir;
    }

    public static void loveSimbe(String animalName, boolean bigHearHeir) {
        if (bigHearHeir == true) {
            System.out.println(animalName + " с большой шевелюрой любит Симбу");
        } else {
            System.out.println("Хоть у " + animalName + " шевелюра и мала, но все равно любит Симбу");
        }

    }

    public static void main(String[] args) {
        Lion king = new Lion("Король Лев", "meet", true, true);
        eat(king.getAnimalName(), king.getFood());
        king.setFood(" а теперь это(так ему и надо) укратитель");
        eat(king.getAnimalName(), king.getFood());
        loveSimbe(king.getAnimalName(),king.getBigHearHeir());

    }
}
