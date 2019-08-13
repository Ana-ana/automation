package Lesson4;

import java.util.Scanner;

public enum Months {
    January("Январь"),
    February("Февраль"),
    March("Март"),
    April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");

    private String russianMonth;
    public String getRussianMonth() {
        return russianMonth;
    }
    Months(String russianMonth) {
        this.russianMonth = russianMonth;
    }
    public static void holidayChecker(Months months) {
        switch (months) {
            case January:
                System.out.println("полмесяца гуляем, потом учиться");
                break;
            case February:
                System.out.println("study");
                break;
            case July:
                System.out.println("Лето, к черту учебу");
                break;
            case October:
                System.out.println("study again");
                break;
            default:
                System.out.println(" делай что хочешь, мне лень писать");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String getMonth = scan.nextLine();
        if (getMonth.equals(Months.January.russianMonth)) {
            Months.holidayChecker(January);
        }
        //here i must wride about every single months in the year.

    }


}
