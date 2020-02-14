/**
 * This is the code for binary search in recursion.
 */
public class BinaryRecursiveSearch implements Practice03Search {

    public int search(int[] a, int target) {

        int max = a.length; //it max and min
        int min = a[1];

        return bs(a, target, max, min); //calls a function cause i couldnt find out how to override search

    }

    public int bs(int[] a, int target, int max, int min) {
        if (min > max)// base case
            return -1;
        int mid = (min + max) / 2;//splits the array into 2

        if (a[mid] == target)
            return mid;

        else if (a[mid] < target) {
            return bs(a, target, mid + 1, max);
        } else if (a[mid] > target) {
            return bs(a, target, min, mid - 1);
        }
        return mid;
    }//end bs
}