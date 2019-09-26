package Array;

public class InsertingSort {

    public static int[] insertSorting(int[] a){
        for (int i = 1; i < a.length ; i++) {
            int temp = a[i];
            int index = i;
            while (index > 0 && a[index-1] >= temp){
                a[index] = a[index- 1];
                index--;
            }
            a[index] = temp;
        }
    return a;
    }
}
