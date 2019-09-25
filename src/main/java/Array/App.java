package Array;


import static Array.BubleSort.bubleSort;
import static Array.BubleSort.printArray;

public class App {

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 2,8,4};
        bubleSort(array).toString();
        printArray(array);
    }
}
