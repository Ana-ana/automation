package Array;


import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;

public class App {

    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 4, 98, 2,8,4, 9, 3};
        bubleSort(array).toString();
        printArray(array);
    }
}
