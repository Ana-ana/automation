/*
merge sorting 26.07.2019
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int[] arrayA = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        for (int i = 0; i <= arrayA.length - 1;i++) {
            int number = scanner.nextInt();
            arrayA[i] = number;
        }
        for (int i = 0; i <= arrayA.length - 1; i++){
            System.out.print(arrayA[i] + " ");
        }


       /* if (arrayA == null) {
            System.out.println("Empty array");
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }*/
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length/2, arrayC, 0, arrayA.length - arrayA.length/2);

        Arrays.sort(arrayB);
        Arrays.sort(arrayC);
        for (int i = 0; i < arrayA.length-1; i++) {
            if ()
                // merge 2 arrays into one
        }







    }
}
