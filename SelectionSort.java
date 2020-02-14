/**
 * code for selection sort
 */

public class SelectionSort implements Practice03Sort {

    public void sort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }//for
    }//ends sort
}
