package Array;

import java.util.Arrays;



public class SelectionSort {

    public static int[] selectSort(int[] a) {

     //   int minValue = a[0];
      //  int temp;
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
        return a;
    }


}
