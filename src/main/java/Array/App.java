package Array;


import java.util.Arrays;

import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;
import static Array.SelectionSort.*;
import static Array.InsertingSort.insertSorting;

public class App {

    public static void main(String[] args) {
        int[] hugeArray = new int[100000];
        for (int i = 0; i < hugeArray.length-1 ; i++) {
            hugeArray[i] = (int) Math.round(Math.random() * 1000);
        }
        int[] hugeArray2 =  Arrays.copyOf(hugeArray, hugeArray.length);

        int[] hugeArray3 = Arrays.copyOf(hugeArray, hugeArray.length);
        hugeArray = insertSorting(hugeArray);


        System.out.println("_______________");
        System.out.println("Insert sorting");
        insertSorting(hugeArray);
        printArray(hugeArray);

        System.out.println("_______________");
        System.out.println("Bubble sorting");
        bubleSort(hugeArray);
        printArray(hugeArray);

        System.out.println("_______________");
        System.out.println("Select sorting");
        selectSort(hugeArray);
        printArray(hugeArray);
        System.out.println("");




    }
}
