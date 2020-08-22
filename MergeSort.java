// Wei Sheng Aw
// 8/22/2020
// This program shows the functions of a merge sort

import java.util.*;

public class MergeSort {
   public static void main(String[] args) {
      int[] a1 = {10, 4, 14, 8, 11, 6, 9};
      System.out.println("a1: " + Arrays.toString(a1));
      System.out.println("mergeSort(a1)... ");
      mergeSort(a1);
      System.out.println("updated a1: " + Arrays.toString(a1));
   }
   // sorts the array using binary insertion sort
   // pre: given an unsorted array
   // post: unsorted array changed to sorted array
   // complexity: O(n log n)
   public static void mergeSort(int[] l) {
      // calls overloaded method with full array length
      mergeSort(l, l.length); 
   }
   // recursively divides and merges a given array
   public static void mergeSort(int[]l, int n) {
      // if there is nothing to divide, break recursive call stack
      if (n < 2) {
         return;
      }
      // halves the array and calls merge sort on both halves
      int mid = n / 2;
      int[] leftL = Arrays.copyOfRange(l, 0, mid);
      int[] rightL = Arrays.copyOfRange(l, mid, n);
      mergeSort(leftL, mid);
      mergeSort(rightL, n - mid);
      // merges both halves of the array
      merge(l, leftL, rightL);
   }
   // merges two arrays into given array l
   public static void merge(int[] l, int[] leftL, int[] rightL) {
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < l.length) {
         // if both arrays have not been traversed fully
         if (j < leftL.length && k < rightL.length) {
            // adds the lowest item in either array to l
            if (leftL[j] <= rightL[k]) {
               l[i] = leftL[j];
               i++;
               j++;
            } else {
               l[i] = rightL[k];
               i++;
               k++;
            }
         // if the left array has no items left, add the next item from the right array
         } else if (j >= leftL.length) {
            l[i] = rightL[k];
            i++;
            k++;
         // if the right array has no items left, add the next item from the left array
         } else {
            l[i] = leftL[j];
            i++;
            j++;
         }
      }
   }
}