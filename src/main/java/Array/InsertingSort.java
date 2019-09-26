package Array;

import java.util.concurrent.TimeUnit;

public class InsertingSort {

    public static int[] insertSorting(int[] a){
        long start = System.nanoTime();
        for (int i = 1; i < a.length ; i++) {
            int temp = a[i];
            int index = i;
            while (index > 0 && a[index-1] >= temp){
                a[index] = a[index- 1];
                index--;
            }
            a[index] = temp;
        }
        long finish = System.nanoTime();
        System.out.println("Insert sorting took " +
                TimeUnit.NANOSECONDS.toMillis(finish-start)+
                " millis");
    return a;
    }
}
