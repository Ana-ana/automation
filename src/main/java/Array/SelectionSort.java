package Array;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class SelectionSort {

    public static int[] selectSort(int[] a) {
        long start = System.nanoTime();
        for (int i = 0; i < a.length-1; i++) {
            int minIndex = i;
            for (int y = i; y < a.length; y++) {
                if (a[y] < a[minIndex]){
                    minIndex = y;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;

            }
        }
        long finish = System.nanoTime();
        System.out.println("Select sorting took " +
                TimeUnit.NANOSECONDS.toMillis(finish-start)+
                " millis");
        return a;
    }


}
