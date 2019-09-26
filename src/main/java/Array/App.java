package Array;


import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;
import static Array.SelectionSort.*;

public class App {

    public static void main(String[] args) {
        System.out.println("_______________");
        System.out.println("Buble sorting");
        int[] array = new int[]{1, 10, 4, 98, 2,8,4, 9, 3};
        bubleSort(array).toString();
        printArray(array);

        System.out.println("_______________");
        System.out.println("Select sorting");
        int[] arrayS = new int[]{20, 10, 4, 98, 2,8,4, 9, 3};
        selectSort(arrayS);
        printArray(arrayS);


    }
}
