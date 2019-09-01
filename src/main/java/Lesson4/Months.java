package Lesson4;

import com.sun.corba.se.impl.logging.IORSystemException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public enum Months {
    January("Январь", 1),
    February("Февраль", 2),
    March("Март", 3);
    /*April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");*/

    private String russianMonth;
    private int number;
    public String getRussianMonth() {
        return russianMonth;
    }

    Months(String russianMonth, int number) {
        this.russianMonth = russianMonth;
        this.number = number;
    }
    public static void holidayChecker(Months months) {
        switch (months) {
            case January:
                System.out.println("полмесяца гуляем, потом учиться");
                break;
            case February:
                System.out.println("study");
                break;
           /* case July:
                System.out.println("Лето, к черту учебу");
                break;
            case October:
                System.out.println("study again");
                break;*/
            default:
                System.out.println(" делай что хочешь, мне лень писать");
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scan = new Scanner(System.in);
        String getMonth = reader.readLine();
        if (getMonth.equals(Months.January.russianMonth)) {
            Months.holidayChecker(January);*/




        }
        //here i must write about every single months in the year.

    }



