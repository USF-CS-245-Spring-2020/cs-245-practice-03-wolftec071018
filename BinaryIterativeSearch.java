/**
 * code for binary search iteratively
 * 
 */

 public class BinaryIterativeSearch implements Practice03Search {
    public int search(int a[],int x){
         int l=0, r=a.length-1;//start r/max
         while(l<=r){
             int m=l+(r-l)/2;//m= mid this splits the array

             if(a[m]<x)
             l=m+1;
             else r=m-1;
         }
         return -1;
     }
 }