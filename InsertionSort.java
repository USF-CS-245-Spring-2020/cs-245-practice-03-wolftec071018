/**
 * code for insertion sort
 */
public class InsertionSort implements Practice03Sort {
    public void sort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }// while
            a[j + 1] = key;
        }//end for
    }//end sort
}