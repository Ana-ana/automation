package Array;

import java.util.concurrent.TimeUnit;

public class BubleSort {

    public static int[] bubleSort(int[] a) {
        long start = System.nanoTime();
        for (int y = 0; y < a.length - 1; y++) {
            int temp = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    //exchange(a[i], a[i+1]);
                    i--;
                }
            }

        }
        long finish = System.nanoTime();
        System.out.println("Bubble sorting took " +
                TimeUnit.NANOSECONDS.toMillis(finish-start)+
                " millis");
        return a;
    }

//    public static int exchange(int a, int b){
//        int t =a;
//        a = b;
//        b = t;
//        return a & b;
//    } this method doesn't change numbers in my array. Why?

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
