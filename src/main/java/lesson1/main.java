package lesson1;/*
merge sorting 26.07.2019
 */

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int[] arrayA = new int[9];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        for (int i = 0; i <= arrayA.length - 1; i++) {
            int number = scanner.nextInt();
            arrayA[i] = number;
        }/*
        for (int i = 0; i <= arrayA.length - 1; i++) {
            System.out.print(arrayA[i] + " ");
        }*/
        print(arrayA);
        //System.out.println(arrayA);
        print(sortArray(arrayA));
    }

    public static int[] sortArray(int[] arrayA) {
        if (arrayA == null) {
            System.out.println("Empty array");
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }


    public static int[] mergeArray(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) { // can't get into this if
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else { // b > a
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public static void print(int[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println(" ");
    }
}
