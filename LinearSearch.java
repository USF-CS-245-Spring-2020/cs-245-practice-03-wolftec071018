/**
 * code for linearSearch
 */

public class LinearSearch implements Practice03Search {
    public int search(int[] a, int x) {
        int n = a.length; // sets n

        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return i;// where i was found
        }//end for
        return -1;
    }//end search
}