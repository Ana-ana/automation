package Array;


import java.util.Arrays;

import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;
import static Array.SelectionSort.*;
import static Array.InsertingSort.insertSorting;

public class App {

    public static void main(String[] args) {
        int[] hugeArray = new int[1000];
        for (int i = 0; i < hugeArray.length-1 ; i++) {
            hugeArray[i] = (int) Math.round(Math.random() * 1000);
        }
        int[] hugeArray2 =  Arrays.copyOf(hugeArray, hugeArray.length);

        int[] hugeArray3 = Arrays.copyOf(hugeArray, hugeArray.length);

        System.out.println("_______________");
        System.out.println("Buble sorting");
        bubleSort(hugeArray);
        printArray(hugeArray);

        System.out.println("_______________");
        System.out.println("Select sorting");
        selectSort(hugeArray2);
        printArray(hugeArray2);
        System.out.println("");

        System.out.println("_______________");
        System.out.println("Insert sorting");
        insertSorting(hugeArray3);
        printArray(hugeArray3);


    }
}
