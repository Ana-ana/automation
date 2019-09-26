package Array;


import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;
import static Array.SelectionSort.*;

public class App {

    public static void main(String[] args) {
        System.out.println("_______________");
        System.out.println("Buble sorting");
        int[] array = new int[]{1, 10, 4, 98, 2,8,4, 9, 3};
        int[] hugeArray = new int[1000];
        for (int i = 0; i < hugeArray.length-1 ; i++) {
            hugeArray[i] = (int) Math.round(Math.random() * 1000);
        }

        bubleSort(hugeArray);
        printArray(hugeArray);

        System.out.println("_______________");
        System.out.println("Select sorting");
        int[] arrayS = new int[]{20, 10, 4, 98, 2,8,4, 9, 3};
        selectSort(arrayS);
        printArray(arrayS);


    }
}
